package com.br.mod15;

import com.br.mod15.car.Car;
import com.br.mod15.factory.Factory;
import com.br.mod15.factory.HatchFactory;
import com.br.mod15.factory.SedanFactory;

public class main {

	public static void main(String[] args) {
		
		Factory fSedan = new SedanFactory();
		Factory fHatch = new HatchFactory();
		
		Car sedan2portas = fSedan.Carro2Portas();
		Car hatch4portas = fHatch.Carro4Portas();
		
		System.out.println(sedan2portas.toString());
		System.out.println(hatch4portas.toString());
	}

}
