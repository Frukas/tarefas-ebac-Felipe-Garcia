package com.br.mod13;

public abstract class Pessoa {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void printDados();

}
