package com.br.mod22;

import java.util.ArrayList;
import java.util.List;

public class PessoasList {	

	private List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
	
	public void addToList(Pessoas p) {
		listaPessoas.add(p);
	}
	
	public List<Pessoas> getListPersonByGender(char genero) {
		return listaPessoas
			.stream()
			.filter(p -> p.getGenero() == genero)
			.toList();
	}
	
	public void printListResult(List<Pessoas> list) {
		if(list.isEmpty()) {
			System.out.println("Não há registros");
		}else {
			list.forEach(p -> System.out.println(p));
		}
	}
}
