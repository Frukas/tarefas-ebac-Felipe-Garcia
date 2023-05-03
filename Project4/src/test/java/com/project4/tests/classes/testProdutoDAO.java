package com.project4.tests.classes;

import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.project4.classes.JPAEntityFactory;
import com.project4.interfaces.AGenericDAO;
import com.projeto4.produto.Produto;
import com.projeto4.produto.ProdutoAbsDAO;

import org.junit.jupiter.api.Order;


@TestMethodOrder(OrderAnnotation.class)
class testProdutoDAO {
	
	static Produto produtoMock;
	//static IGenericDAO<Produto> dao;
	static AGenericDAO<Produto> dao;
	
	@BeforeAll
	static void setUp() {
		dao = new ProdutoAbsDAO(new JPAEntityFactory());
		produtoMock = new Produto("Nescau", "Nestle" );
	}

	@Test
	@Order(1)
	void testCadastrar() throws Exception{
		int res = dao.cadastrar(produtoMock);
		
		assertTrue(res > 0);
	}

	@Test
	@Order(2)
	void testAtualizar() throws Exception{
		produtoMock.setFabricante("Alguma firma suiça");
		int res = dao.atualizar(produtoMock);
		assertTrue(res > 0);
	}

	@Test
	@Order(3)
	void testBuscar()throws Exception {
		Produto resProduto = dao.buscar( produtoMock.getNome());
		assertEquals(produtoMock.getNome(), resProduto.getNome());
	}

	@Test
	@Order(4)
	void testBuscarTodos() throws Exception {
		List<Produto> listProduto = dao.buscarTodos();
		assertTrue(listProduto.size() > 0);
	}

	@Test
	@Order(5)
	void testExcluir() throws Exception {
		int res = dao.excluir(produtoMock.getNome());
		assertTrue(res > 0);
	}
}
