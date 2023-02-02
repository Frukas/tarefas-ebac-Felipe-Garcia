package com.br.mod24;

public interface IContratoDao {

	public void salvar();	
	public String buscar(int number);
	public void excluir(int number);
	public void atualizar(int number);
	
	//TODO buscar , excluir e atualizar
}
