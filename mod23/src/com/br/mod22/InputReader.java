package com.br.mod22;

import java.util.Scanner;

public class InputReader {
	
	public Pessoas InputNewPessoas() {
		
		Scanner in = new Scanner(System.in);
		Pessoas pessoa = new Pessoas();
		
		System.out.println("Digite o nome da pessoa");
		pessoa.setNome(in.nextLine());		

		System.out.println("Digite o genero: (M)asculino/(F)eminino/(N)eutro ");
		pessoa.setGenero(in.nextLine());
	
		in.close();
		return pessoa;		
	}
	
	public void InputSeveralPessoas(PessoasList list) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escolha a quantidade de pessoas: ");
		int quantidade = in.nextInt();
				
		for(int i = 0; i < quantidade; i++) {			
			list.addToList(InputNewPessoas());
		}
		in.close();
	}	
}
