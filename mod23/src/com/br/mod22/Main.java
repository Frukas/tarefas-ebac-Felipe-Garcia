package com.br.mod22;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputReader inReader = new InputReader();
		PessoasList pessoaslist = new PessoasList();		

		inReader.InputSeveralPessoas(pessoaslist);
		
		List<Pessoas> resultlist = pessoaslist.getListPersonByGender('F');
		pessoaslist.printListResult(resultlist);

	}
}
