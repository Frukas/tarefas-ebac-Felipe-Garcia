package com.mod36.tests.classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import com.mod36.classes.JPAEntityFactory;
import com.mod36.cliente.Cliente;
import com.mod36.cliente.ClienteAbsDAO;
import com.mod36.interfaces.AGenericDAO;

@TestMethodOrder(OrderAnnotation.class)
class testClienteDAO {
	
	static Cliente clientemock;
	static //IGenericDAO<Cliente> dao;
	AGenericDAO<Cliente> dao;
	
	
	@BeforeAll
	static void setUp() {
		//dao = new ClienteJPADAO(new JPAEntityFactory());	
		dao = new ClienteAbsDAO(new JPAEntityFactory());
		clientemock = new Cliente("321321", "Joao do Teste", "Endereço de Teste" );
	}	
	
	@Test
	@Order(1)
	void testCadastrar() throws Exception {			
		int res = dao.cadastrar(clientemock);
		assertTrue(res > 0);
	}	
	
	@Test
	@Order(2)
	void testBuscar() throws Exception{	
		Cliente cl = dao.buscar("321321");
		
		
		System.out.println(cl.getCpf());
		
		assertEquals(clientemock.getCpf(), cl.getCpf());
	}	
	
	@Test
	@Order(3)
	void testbuscarTodos() throws Exception{		
		List<Cliente> clienteListRes = dao.buscarTodos();
		assertTrue(clienteListRes.size() >0);
	}
	
	@Test
	@Order(4)
	void testAtualizar() throws Exception{		
		clientemock.setNome("Maria");
		int res = dao.atualizar(clientemock);
		assertTrue(res > 0);
		
		Cliente clienteRes = dao.buscar(clientemock.getCpf());
		assertEquals("Maria", clienteRes.getNome());		
	}	
	
	@Test
	@Order(5)
	void testExcluir() throws Exception {		
		int res = dao.excluir(clientemock.getCpf());
		assertTrue(res > 0);
	}
}
