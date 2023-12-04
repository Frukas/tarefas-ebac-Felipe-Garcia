package com.ProjetoJSF.classes;

import java.util.List;

import javax.persistence.EntityManager;

import com.ProjetoJSF.interfaces.IGenericDAO;
import com.ProjetoJSF.model.Cliente;
import com.ProjetoJSF.interfaces.IEntityManagerFactory;

public class ClienteDAO implements IGenericDAO<Cliente> {
	
	EntityManager entityManager;
	IEntityManagerFactory entityManagerFactory;
	
	public ClienteDAO(IEntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public int cadastrar(Cliente entity) throws Exception {
		try {
			this.entityManager = entityManagerFactory.getEntityManager();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();		
			entityManagerFactory.closeEntityManager();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int atualizar(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente buscar(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int excluir(String deleteName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
