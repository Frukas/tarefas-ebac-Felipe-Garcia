package com.projeto4.produto;

import java.util.List;

import javax.persistence.EntityManager;

import com.project4.interfaces.IEntityManagerFactory;
import com.project4.interfaces.IGenericDAO;

public class ProdutoJPADAO implements IGenericDAO<Produto> {
	
	EntityManager entityManager;
	IEntityManagerFactory entityManagerFactory;
	
	public ProdutoJPADAO(IEntityManagerFactory entityManagerFactory)  {
			this.entityManagerFactory = entityManagerFactory;	
	}
	
	@Override
	public int cadastrar(Produto entity) throws Exception {		
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
	@Override
	public int atualizar(Produto entity) throws Exception {
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
	
	@Override
	public Produto buscar(String codigo) throws Exception {
		this.entityManager = entityManagerFactory.getEntityManager();
		StringBuffer nStr = new StringBuffer();
		String query = "SELECT p FROM Produto p WHERE p.nome =";
		nStr.append(query);
		nStr.append("'");	
		nStr.append(codigo);
		nStr.append("'");	
		List<Produto> lista = entityManager.createQuery(nStr.toString(), Produto.class).getResultList();
		
		entityManagerFactory.closeEntityManager();
		
		return lista.get(0);
	}
	
	@Override
	public List<Produto> buscarTodos() throws Exception {		
		this.entityManager = entityManagerFactory.getEntityManager();
		String query = "SELECT p FROM Produto p ";	
		List<Produto> lista = entityManager.createQuery(query, Produto.class).getResultList();		
		entityManagerFactory.closeEntityManager();		
		return lista;
	}
	
	@Override
	public int excluir(String deleteName) throws Exception {
		try {
			Produto toBeRemoved =  this.buscar(deleteName);
			
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
