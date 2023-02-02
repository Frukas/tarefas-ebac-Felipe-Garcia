package com.br.mod24.test;

import org.junit.Assert;
import org.junit.Test;

import com.br.mod24.ContratoDao;
import com.br.mod24.ContratoService;
import com.br.mod24.IContratoDao;
import com.br.mod24.IContratoService;
import com.br.mod24.mock.ContratoDaoMock;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);		
	}
	
	@Test(expected= UnsupportedOperationException.class)
	public void salvarComErroTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();		
	}
	
	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar(0);
		Assert.assertEquals("Registro encontrado", retorno);
	}
	
	@Test(expected= UnsupportedOperationException.class)
	public void buscarComErroTest() {
		IContratoDao dao = new  ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar(0);
	}
	
	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir(0);
		Assert.assertEquals("Registro excluido", retorno);
	}
	
	@Test(expected= UnsupportedOperationException.class)
	public void excluirComErroTest() {
		IContratoDao dao = new  ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir(0);
	}
	
	@Test
	public void atualizar() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar(0);
		Assert.assertEquals("Registro atualizado", retorno);
	}
	
	@Test(expected= UnsupportedOperationException.class)
	public void atualizarComErroTest() {
		IContratoDao dao = new  ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir(0);
	}
}
