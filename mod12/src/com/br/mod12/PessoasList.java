package com.br.mod12;

import java.util.ArrayList;
import java.util.List;

public class PessoasList {	

	private List<Pessoas> Masculino = new ArrayList<Pessoas>();
	private List<Pessoas> Feminino = new ArrayList<Pessoas>();
	private List<Pessoas> Neutro = new ArrayList<Pessoas>();
	
	public void addToList(Pessoas p) {
		
		switch (p.getGenero()) {
			case 'M':
				Masculino.add(p);
				break;
			case 'F':
				Feminino.add(p);
				break;
			default:
				Neutro.add(p);
		}
	}
	
	public void printPessoasList() {
		
		System.out.println(" ");
		System.out.println("Lista Masculina");
		for(Pessoas p : Masculino) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("Lista Feminina");
		for(Pessoas p : Feminino) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("Lista Neutra");
		for(Pessoas p : Neutro) {
			System.out.println(p);
		}
	}
	
	 public boolean isEmpty() {
		return Masculino.isEmpty() && Feminino.isEmpty() && Neutro.isEmpty();
	}
}
