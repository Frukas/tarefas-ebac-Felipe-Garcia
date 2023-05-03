package com.projeto4.vendas;

import com.project4.interfaces.AGenericDAO;
import com.project4.interfaces.IEntityManagerFactory;

public class VendaAbsDAO extends AGenericDAO<Vendas> {

	public VendaAbsDAO(IEntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory, Vendas.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vendas buscar(String codigo) throws Exception {
		Vendas res = null;
		try {
			this.entityManager = entityManagerFactory.getEntityManager();
			int cod = Integer.parseInt(codigo);
			res = entityManager.find(persistenteClass, cod);
		}catch (Exception e) {
			e.printStackTrace();			
		}finally {
			entityManagerFactory.closeEntityManager();
		}
		return res;
	}

}
