package com.projeto4.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id ;
	
	@Column(name="cpf", nullable=false , unique=true)
	private String cpf;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="endereco", nullable=false)
	private String endereco;
	
	public Cliente() {}	
	
	public Cliente(int id, String cpf, String nome, String endereco) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;		
	}
	
	public Cliente(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
	}		

}
