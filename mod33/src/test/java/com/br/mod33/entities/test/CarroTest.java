package com.br.mod33.entities.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void test() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager =  emFactoryObj.createEntityManager();
	}

}
