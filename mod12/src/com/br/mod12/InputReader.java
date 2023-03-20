package com.br.mod12;

import java.util.Scanner;
import java.util.Arrays;

public class InputReader {
	
	public Pessoas InputNewPessoas() {
		
		try (Scanner in = new Scanner(System.in)) {
			Pessoas pessoa = new Pessoas();
			
			System.out.println("Digite o nome da pessoa");
			pessoa.setNome(in.nextLine());		

			System.out.println("Digite o genero: (M)asculino/(F)eminino/(N)eutro ");
			pessoa.setGenero(in.nextLine());

			return pessoa;
		}		
	}
	
	public void InputPessoaInLine(PessoasList list) {
		Scanner in = new Scanner(System.in);		
		System.out.println("Digite sequencia de nome separado por vírgula. ");
		System.out.println("Pode também acrescentar genero depois do nome com um traço.");
		String sequenciaPessoas = in.nextLine();
		
		String[] pessoas = orderNameWithComa(sequenciaPessoas);
		
		//↓↓↓↓↓↓↓↓↓↓↓↓↓Primeira parte da tarefa ↓↓↓↓↓↓↓↓↓↓↓↓↓
		if(!sequenciaPessoas.contains("-")) {				
			
			for(String pessoa : pessoas) {
				System.out.println(pessoa.trim());
			}
			in.close();
			return;
		}	
		//↑↑↑↑↑↑↑↑↑↑↑↑↑↑Primeira parte da tarefa↑↑↑↑↑↑↑↑↑↑↑↑↑↑
		
		for(String pessoa: pessoas) {
			String nome = pessoa.split("-")[0].trim();
			String genero = pessoa.split("-")[1].trim();
			
			list.addToList(new Pessoas(nome,genero ));
		}
		in.close();
	}
	
	public void InputSeveralPessoas(PessoasList list) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Escolha a quantidade de pessoas: ");
			int quantidade = in.nextInt();
					
			for(int i = 0; i < quantidade; i++) {
				list.addToList(InputNewPessoas());
			}
		}	
	}	
	
	private String[] trimString(String[] stringArray) {
		String[] res = new String[stringArray.length];
		
		for(int i = 0; i < stringArray.length; i++ ) {
			res[i] = stringArray[i].trim();
		}		
		
		return res;
	}
	
	private String[] orderNameWithComa(String names) {
		
		String[] pessoas ;
	
		pessoas = names.split(",");
		
		pessoas = trimString(pessoas);
		
		Arrays.sort(pessoas);
		
		return pessoas;
	}
}
