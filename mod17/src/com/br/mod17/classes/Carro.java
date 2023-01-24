package com.br.mod17.classes;

public abstract class Carro {

	private int qtyPortas;
	private String tipoPortaMalas;
	private String TipoCombustivel;
	private String marca;
	
	public Carro(){
		
	}
	
	public int getQtyPortas() {
		return qtyPortas;
	}
	public void setQtyPortas(int qtyPortas) {
		this.qtyPortas = qtyPortas;
	}
	public String getTipoPortaMalas() {
		return tipoPortaMalas;
	}
	public void setTipoPortaMalas(String tipoPortaMalas) {
		this.tipoPortaMalas = tipoPortaMalas;
	}
	public String getTipoCombustivel() {
		return TipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
