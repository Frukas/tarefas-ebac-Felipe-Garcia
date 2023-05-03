package com.projeto4.vendas;

import java.util.List;

import javax.persistence.EntityManager;

import com.project4.interfaces.IEntityManagerFactory;
import com.project4.interfaces.IGenericDAO;

public class VendasJPADAO implements IGenericDAO<Vendas>  {
	
	EntityManager entityManager;
	IEntityManagerFactory entityManagerFactory;

	@Override
	public int cadastrar(Vendas entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int atualizar(Vendas entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vendas buscar(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendas> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int excluir(String deleteName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
