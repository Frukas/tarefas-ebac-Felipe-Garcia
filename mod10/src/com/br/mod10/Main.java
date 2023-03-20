package com.br.mod10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		notasHandler notasSemestral = new notasHandler(1);
		
		notasSemestral.inputNotas();		
		
		System.out.println(notasSemestral.statusAvaliacao());

	}
}
