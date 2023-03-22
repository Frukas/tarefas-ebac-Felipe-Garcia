package com.br.mod32.produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUTO")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto_seq")
	@SequenceGenerator(name="produto_seq", sequenceName="sq_produto", initialValue=1)
	private int id;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="NOME", nullable=false)
	private String Fabricante;
	
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
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

}
