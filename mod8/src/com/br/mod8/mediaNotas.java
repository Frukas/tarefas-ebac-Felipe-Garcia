package com.br.mod8;

public class mediaNotas {
	
	private float[] notas = new float[4];
	private final int MAX_NOTAS = 3;
	private int quantidadeNotas = 0;
	
	
	public mediaNotas setNotas(float nota) {
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
