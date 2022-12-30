package com.br.mod13;

public class PessoaFisica extends Pessoa {
	
	private String CPF;
	
	public PessoaFisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
	}	


	@Override
	public void printDados() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());		
	}

	@Override
	public String toString() {
		return "PessoaFisica [Nome: "+ this.getNome() + " CPF:" + CPF + "]";
	}


}
