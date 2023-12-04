package com.ProjetoJSF.bean;

import java.io.Serializable;

import com.ProjetoJSF.classes.ClienteDAO;
import com.ProjetoJSF.classes.EntitiyFactory;
import com.ProjetoJSF.interfaces.IEntityManagerFactory;
import com.ProjetoJSF.model.Cliente;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean(name = "clienteBean")
public class ClienteBean {
	
	private String nome;
	private String cpf;
	private String telefone;
	
	private IEntityManagerFactory em = new EntitiyFactory();
	private ClienteDAO cldao = new ClienteDAO(em);
	
	public ClienteBean(){}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastrar() throws Throwable {
		Cliente cl = new Cliente(this.nome, this.cpf, this.telefone);
		cldao.cadastrar(cl);
	}

}
