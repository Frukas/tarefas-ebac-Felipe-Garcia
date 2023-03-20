package com.project3.tests.classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import com.project3.classes.ConnectionFactoryDB;
import com.project3.interfaces.IGenericDAO;
import com.projeto3.cliente.Cliente;
import com.projeto3.cliente.ClienteDAO;

@TestMethodOrder(OrderAnnotation.class)
class testClienteDAO {
	
	static Cliente clientemock;
	static IGenericDAO<Cliente> dao;	
	
	@BeforeAll
	static void setUp() {
		dao = new ClienteDAO(new ConnectionFactoryDB());
		clientemock = new Cliente("321Test", "Joao do Teste", "Endereço de Teste" );
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
		Cliente cl = dao.buscar("321Test");
		
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
