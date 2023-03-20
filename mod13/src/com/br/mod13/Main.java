package com.br.mod13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pessoa fisica = new PessoaFisica("João", "234.543.234-2");
//		Pessoa juridica = new PessoaJuridica("Banco do Butão", "223.456.345/4");		

		Pessoa[] pessoas = {new PessoaFisica("João", "234.543.234-2"),
							new PessoaJuridica("Banco do Butão", "223.456.345/4") };
		
		printDados(pessoas);
	}	
	
	public static void printDados(Pessoa[] pessoas) {
		for(Pessoa p : pessoas) {
			p.printDados();
		}
	}

}
