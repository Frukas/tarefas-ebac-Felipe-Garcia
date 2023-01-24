package com.br.mod17;

import com.br.mod17.classes.Carro;
import com.br.mod17.classes.CarroFiat;
import com.br.mod17.classes.CarroFord;
import com.br.mod17.list.GenericList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericList<? super Carro> listaDeCarros = new GenericList<>(); 
		
		listaDeCarros.adicionarLista(new CarroFiat());
		listaDeCarros.adicionarLista(new CarroFord());
		
		for(Object carro: listaDeCarros.getLista()) {
			if(carro instanceof Carro ) {
				System.out.println(((Carro) carro).getMarca());
			}
		}		
	}
}
