package com.mod36.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")	
	private String nome;
	
	@Column(name="fabricante")		
	private String fabricante;
	
	@Column(name="valor")
	private float valor;

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
