package com.project4.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class AGenericDAO<T> {
	
	protected EntityManager entityManager;
	protected IEntityManagerFactory entityManagerFactory;
	protected Class<T> persistenteClass;	
	
	public AGenericDAO(IEntityManagerFactory entityManagerFactory, Class<T> persistenteClass)  {
			this.entityManagerFactory = entityManagerFactory;	
		    this.persistenteClass = persistenteClass;			
	}	
	
	public int cadastrar(T entity) throws Exception {		
		try {
			this.entityManager = entityManagerFactory.getEntityManager();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			entityManagerFactory.closeEntityManager();
		}
		return 1;
	}
	
	public int atualizar(T entity) throws Exception {
		try {
			this.entityManager = entityManagerFactory.getEntityManager();
			entityManager.merge(entity);
			entityManager.getTransaction().commit();		

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			entityManagerFactory.closeEntityManager();
		}
		return 1;
	}	
	
	public abstract T buscar(String codigo) throws Exception;

	public List<T> buscarTodos() throws Exception {	
		
		this.entityManager = entityManagerFactory.getEntityManager();
		String query = "SELECT p FROM " + this.persistenteClass.getSimpleName() + " p" ;
		
		List<T> lista = entityManager.createQuery(query, persistenteClass).getResultList();		
		entityManagerFactory.closeEntityManager();		
		return lista;
	}	

	public int excluir(String deleteName) throws Exception {
		try {
			T toBeRemoved =  this.buscar(deleteName);
			
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
