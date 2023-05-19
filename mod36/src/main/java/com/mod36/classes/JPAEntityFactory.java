package com.mod36.classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mod36.interfaces.IEntityManagerFactory;

public class JPAEntityFactory implements IEntityManagerFactory {
	
	EntityManagerFactory emFactoryObj ;
	EntityManager entityManager ;
	
	@Override
	public EntityManager getEntityManager()  {
		emFactoryObj = Persistence.createEntityManagerFactory("ProductionDBA");
		entityManager =  emFactoryObj.createEntityManager();
		entityManager.getTransaction().begin();
		return entityManager;
	}
	@Override
	public void closeEntityManager()  {
		entityManager.close();
		emFactoryObj.close();		
	}
}
