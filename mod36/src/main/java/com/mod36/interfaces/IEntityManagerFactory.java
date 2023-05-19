package com.mod36.interfaces;

import javax.persistence.EntityManager;

public interface IEntityManagerFactory {
	
	public EntityManager getEntityManager() ;
	public void closeEntityManager() ;
}
