package com.br.mod15.factory;

import com.br.mod15.car.Car;
import com.br.mod15.car.CarHatch;

public class HatchFactory extends Factory {
	
	@Override
	public Car Carro2Portas() {
		Car car = new CarHatch();
		car.setColor("Preto");
		car.setQtPortas(2);
		return car;
	}

	@Override
	public Car Carro4Portas() {
		Car car = new CarHatch();
		car.setColor("Preto");
		car.setQtPortas(4);
		return car;
	}
}
