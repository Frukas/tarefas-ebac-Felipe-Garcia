package com.br.mod13;

public class PessoaJuridica extends Pessoa {
	
	private String CNPJ;

	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	@Override
	public void printDados() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());		
	}

	@Override
	public String toString() {
		return "PessoaJuridica [Nome: " + this.getNome() +  " CNPJ: " + CNPJ + "]";
	}

}
