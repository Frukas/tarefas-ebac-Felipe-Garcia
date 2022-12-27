package com.br.mod10;

import java.util.Scanner;

public class notasHandler {
	

	private float[] notas;
	private Scanner in = new Scanner(System.in);
	private float media;
	
	public notasHandler(int quantNotas) {

		this.notas = new float[quantNotas];
	}	
	
	public void inputNotas() {		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i+1) + ":");
			notas[i] = in.nextFloat();
		}	
		calcMedia();
	}
	
	
	public void printNotas() {
		
		System.out.println("Notas: ");		
		for(float nota: notas) {			
			System.out.println(nota);
		}
		
		System.out.println("Media: ");
		System.out.println(media);
	}
	
	private void calcMedia() {

		for(float nota : notas) {
			media += nota;
		}
		media = media/notas.length;
	}
	
	public String statusAvaliacao() {		
		
		if(media >= 7) {
			return "Passou";
		}else if(media >= 5){
			return "Recuperação";
		}
		
		return "Não Passou";
	}
}
