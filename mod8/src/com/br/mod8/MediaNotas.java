package com.br.mod8;

public class MediaNotas {
	
	private float[] notas = new float[4];
	private final int MAX_NOTAS = 3;
	private int quantidadeNotas = 0;
	//private Scanner myObj = new Scanner(System.in);
	
	
	public MediaNotas setNotas(float nota) {
		if(this.quantidadeNotas <= this.MAX_NOTAS) {
			notas[this.quantidadeNotas] = nota;
			this.quantidadeNotas++;			
		}else {
			System.out.println("Mais que 4 notas fora adicionadas");
		}		
		return this;
	}
	
	public float getMedia() {
		
		float res = 0f;
		
		for(float nota : notas) {
			res += nota;			
		}		
		return res/4;
	}
	
	public void printMedia() {
		
		System.out.println(this.getMedia());
	}
}
