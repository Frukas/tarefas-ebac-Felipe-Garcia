package com.br.mod15.car;

public abstract class Car {
	private int qtPortas;
	private String color;
	private String TipoPortaMalas;
	
	public Car(){};
	
	
	public int getQtPortas() {
		return qtPortas;
	}

	public void setQtPortas(int qtPortas) {
		this.qtPortas = qtPortas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoPortaMalas() {
		return TipoPortaMalas;
	}

	public void setTipoPortaMalas(String tipoPortaMalas) {
		TipoPortaMalas = tipoPortaMalas;
	}

	public abstract void clean();
	
	public abstract void mechanicCheck();
	public abstract void fuelCar();
	public abstract void startEngine();
	
	public String toString() {
		return "Tipo: " + getTipoPortaMalas() + " Cor: " + getColor() + " Quantidade de Portas: " + getQtPortas();
	}
}
