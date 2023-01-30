package com.br.mod22;

import java.util.ArrayList;
import java.util.List;

public class PessoasList {	

	private List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
	
	public void addToList(Pessoas p) {
		listaPessoas.add(p);
	}
	
	public void printPersonByGender(char genero) {
		listaPessoas
			.stream()
			.filter(p -> p.getGenero() == genero)
			.forEach(p -> System.out.println(p));
	}
}
