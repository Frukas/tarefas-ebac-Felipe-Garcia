package com.projeto3.produto;

public class Produto {
	
	private int id;
	private String nome;
	private String fabricante;
	
	public Produto() {};	
	
	public Produto(int id, String nome, String fabricante) {		
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public Produto(String nome, String fabricante) {		
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", fabricante=" + fabricante + "]";
	}	
	
//	CREATE TABLE produto(
//			ID SERIAL,
//		    nome varchar(30) not null,
//		    fabricante varchar(30) not null ,
//		    PRIMARY KEY(ID)
//		);
}
