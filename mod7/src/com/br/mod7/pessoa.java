package com.br.mod7;

public class pessoa {
	
	private String nome;
	private int idade;
	
	public pessoa() {};
	
	public pessoa(String nome, int idade, float altura, float peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	private float altura;
	private float peso;
	
	public String getNome() {
		return nome;
	}
	public pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public int getIdade() {
		return idade;
	}
	public pessoa setIdade(int idade) {
		this.idade = idade;
		return this;
	}
	public float getAltura() {
		return altura;
	}
	public pessoa setAltura(float altura) {
		this.altura = altura;
		return this;
	}
	public float getPeso() {
		return peso;
	}
	public pessoa setPeso(float peso) {
		this.peso = peso;
		return this;
	}
	
	public float getMassaCorporal() {
		
		return this.peso /((this.altura)*(this.altura));		
	}
	
	public void printInfo() {
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("Altura:" + altura);
		System.out.println("Peso:" + peso);
		System.out.println("Massa Corporal:" + getMassaCorporal());
		System.out.println();
	}
}
