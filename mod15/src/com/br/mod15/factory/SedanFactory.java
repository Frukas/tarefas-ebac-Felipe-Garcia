package com.br.mod15.factory;

import com.br.mod15.car.Car;
import com.br.mod15.car.CarSedan;

public class SedanFactory extends Factory {
	
	@Override
	public Car Carro2Portas() {
		Car car = new CarSedan();
		car.setColor("Branco");
		car.setQtPortas(2);
		return car;
	}

	@Override
	public Car Carro4Portas() {
		Car car = new CarSedan();
		car.setColor("Branco");
		car.setQtPortas(4);
		return car;
	}
}
