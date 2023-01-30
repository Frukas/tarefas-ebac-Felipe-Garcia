package com.br.mod22;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputReader inReader = new InputReader();
		PessoasList pessoaslist = new PessoasList();		

		inReader.InputSeveralPessoas(pessoaslist);
		
		pessoaslist.printPersonByGender('F');		
		
	}

}
