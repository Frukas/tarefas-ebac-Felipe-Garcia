package com.mod36.produto;

import java.util.List;

import com.mod36.classes.JPAEntityFactory;
import com.mod36.interfaces.AGenericDAO;


public class ProdutoAbsDAO extends AGenericDAO<Produto> {

	public ProdutoAbsDAO(JPAEntityFactory jpaEntityFactory) {
		super(jpaEntityFactory, Produto.class);
		// TODO Auto-generated constructor stub
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

}
