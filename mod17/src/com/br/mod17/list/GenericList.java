package com.br.mod17.list;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {

	List<T> lista = new ArrayList<>();
	
	public void adicionarLista(T objeto) {
		lista.add(objeto);
	}
	
	public List<T> getLista(){
		return lista;
	}
	
}
