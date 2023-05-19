package com.mod36.tests.classes;

import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.mod36.classes.JPAEntityFactory;
import com.mod36.cliente.Cliente;
import com.mod36.cliente.ClienteAbsDAO;
import com.mod36.interfaces.AGenericDAO;
import com.mod36.produto.Produto;
import com.mod36.produto.ProdutoAbsDAO;
import com.mod36.vendas.VendaAbsDAO;
import com.mod36.vendas.Vendas;

import org.junit.jupiter.api.Order;


@TestMethodOrder(OrderAnnotation.class)
class testVendaDAO {
	
	static Produto produtoMock;
	static Vendas vendasMock;
	static Cliente clienteMock;
	static AGenericDAO<Vendas> dao;
	
	static AGenericDAO<Produto> produtoDao;
	static AGenericDAO<Cliente> clienteDao; 
	
	@BeforeAll
	static void setUp() {
		dao = new VendaAbsDAO(new JPAEntityFactory());
		produtoDao = new ProdutoAbsDAO(new JPAEntityFactory());
		clienteDao = new ClienteAbsDAO(new JPAEntityFactory());
		
		produtoMock = new Produto("Nescau", "Nestle" );
		clienteMock = new Cliente("321321", "Joao do Teste", "Endereço de Teste" );
		

		
		
		List<Produto> listMock = new ArrayList<Produto>();
		listMock.add(produtoMock);
		
		vendasMock = new Vendas(clienteMock, listMock , LocalDate.now(),  1.99f);
	}

	@Test
	@Order(1)
	void testCadastrar() throws Exception{	
		
		produtoDao.cadastrar(produtoMock);
		clienteDao.cadastrar(clienteMock);
				
		int res = dao.cadastrar(vendasMock);
		
		assertTrue(res > 0);
	}

	@Test
	@Order(2)
	void testAtualizar() throws Exception{
		vendasMock.setValorTotal(2.99f);		
		int res = dao.atualizar(vendasMock );
		assertTrue(res > 0);
	}

	@Test
	@Order(3)
	void testBuscar()throws Exception {
		Vendas resVendas = dao.buscar( String.valueOf(vendasMock.getId())  );
		assertEquals(vendasMock.getValorTotal(),resVendas.getValorTotal() );
	}

	@Test
	@Order(4)
	void testBuscarTodos() throws Exception {
		List<Vendas> listVendas = dao.buscarTodos();
		assertTrue(listVendas.size() > 0);
	}

	@Test
	@Order(5)
	void testExcluir() throws Exception {		
		int res = dao.excluir(String.valueOf(vendasMock.getId()));
		
		produtoDao.excluir(produtoMock.getNome());
		clienteDao.excluir(clienteMock.getCpf());		

		assertTrue(res > 0);
	}
}
