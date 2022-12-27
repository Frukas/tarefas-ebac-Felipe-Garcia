package br.com.mod11;

public class Pessoas {
	
	private String nome;
	private char genero;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getGenero() {
		return genero;
	}
	public void setGenero(String genero) {	
		
		this.genero = genero.toUpperCase().charAt(0);
		
		if(this.genero != 'M' && this.genero != 'F' ) {
			this.genero = 'N';
		}
	}
	
	@Override
	public String toString() {
		return "Pessoas [Nome: " + nome + ", Genero: " + genero + "]";
	}	
}
