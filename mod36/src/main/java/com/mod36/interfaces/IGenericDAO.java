package com.mod36.interfaces;

import java.util.List;

public interface IGenericDAO<T> {
	public int cadastrar(T entity) throws Exception;
	public int atualizar(T entity) throws Exception;
	public T buscar(String codigo) throws Exception;
	public List<T> buscarTodos() throws Exception;
	public int excluir(String deleteName) throws Exception;
}
