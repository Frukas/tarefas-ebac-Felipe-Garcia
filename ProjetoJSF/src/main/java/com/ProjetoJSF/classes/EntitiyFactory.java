package com.ProjetoJSF.classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ProjetoJSF.interfaces.IEntityManagerFactory;

public class EntitiyFactory implements IEntityManagerFactory {
	
	EntityManagerFactory emFactoryObj ;
	EntityManager entityManager ;

	@Override
	public EntityManager getEntityManager() {
		emFactoryObj = Persistence.createEntityManagerFactory("ProjetoJSF");
		entityManager =  emFactoryObj.createEntityManager();
		entityManager.getTransaction().begin();
		return entityManager;
	}

	@Override
	public void closeEntityManager() {
		entityManager.close();
		emFactoryObj.close();		
	}
}
