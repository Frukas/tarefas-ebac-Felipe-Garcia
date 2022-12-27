package br.com.mod11;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputReader inReader = new InputReader();
		PessoasList pessoaslist = new PessoasList();		
		
//		Pessoas p = inReader.InputNewPessoas();
//		pessoaslist.addToList(p);
		
		inReader.InputSeveralPessoas(pessoaslist);
		
		pessoaslist.printPessoasList();		
		
	}

}
