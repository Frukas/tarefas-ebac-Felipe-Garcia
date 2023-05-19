package com.mod36.cliente;

import java.util.List;

import com.mod36.interfaces.AGenericDAO;
import com.mod36.interfaces.IEntityManagerFactory;

public class ClienteAbsDAO extends AGenericDAO<Cliente>{

	public ClienteAbsDAO(IEntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory, Cliente.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente buscar(String codigo) throws Exception {
		entityManager = entityManagerFactory.getEntityManager();
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

}
