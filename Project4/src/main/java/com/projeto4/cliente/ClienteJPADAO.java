package com.projeto4.cliente;

import java.util.List;

import javax.persistence.EntityManager;

import com.project4.interfaces.IEntityManagerFactory;
import com.project4.interfaces.IGenericDAO;

public class ClienteJPADAO implements IGenericDAO<Cliente> {
	
	EntityManager entityManager;
	IEntityManagerFactory entityManagerFactory;
	
	public ClienteJPADAO(IEntityManagerFactory entityManagerFactory)  {
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
		try {
			this.entityManager = entityManagerFactory.getEntityManager();
			entityManager.merge(entity);
			entityManager.getTransaction().commit();		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally {
			entityManagerFactory.closeEntityManager();
		}
		return 1;
	}
	
	@Override
	public Cliente buscar(String codigo) throws Exception {
		this.entityManager = entityManagerFactory.getEntityManager();
		StringBuffer nStr = new StringBuffer();
		String query = "SELECT c FROM Cliente c WHERE c.cpf =";
		nStr.append(query);
		nStr.append("'");	
		nStr.append(codigo);
		nStr.append("'");	
		List<Cliente> lista = entityManager.createQuery(nStr.toString(), Cliente.class).getResultList();
		
		entityManagerFactory.closeEntityManager();
		
		return lista.get(0);
	}
	
	@Override
	public List<Cliente> buscarTodos() throws Exception {		
		this.entityManager = entityManagerFactory.getEntityManager();
		String query = "SELECT c FROM Cliente c ";	
		List<Cliente> lista = entityManager.createQuery(query, Cliente.class).getResultList();		
		entityManagerFactory.closeEntityManager();		
		return lista;
	}
	
	@Override
	public int excluir(String deleteName) throws Exception {
		try {
			Cliente toBeRemoved =  this.buscar(deleteName);
			
			this.entityManager = entityManagerFactory.getEntityManager();
			toBeRemoved = entityManager.merge(toBeRemoved);
			entityManager.remove(toBeRemoved);
			entityManager.getTransaction().commit();		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally {
			entityManagerFactory.closeEntityManager();
		}
		
		return 1;
	}
}
