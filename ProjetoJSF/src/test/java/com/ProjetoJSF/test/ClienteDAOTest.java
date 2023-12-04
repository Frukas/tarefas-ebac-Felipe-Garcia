package com.ProjetoJSF.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ProjetoJSF.classes.ClienteDAO;
import com.ProjetoJSF.classes.EntitiyFactory;
import com.ProjetoJSF.interfaces.IEntityManagerFactory;
import com.ProjetoJSF.model.Cliente;

public class ClienteDAOTest {
	
	IEntityManagerFactory em = new EntitiyFactory();
	ClienteDAO cl = new ClienteDAO(em);

	@Before
	public void setUp() throws Exception {
		Cliente mockCliente = new Cliente("Joao", "3456123", "2349-24546");
		cl.cadastrar(mockCliente);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
