package com.br.mod12;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputReader inReader = new InputReader();
		PessoasList pessoaslist = new PessoasList();
		
		inReader.InputPessoaInLine(pessoaslist);

		if(!pessoaslist.isEmpty())
			pessoaslist.printPessoasList();
		
	}

}
