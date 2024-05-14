package epscmod05.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import espcmod05.classes.Calculadora;

class calculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test
	void isAddingTwoNumbers() {
		assertEquals(calc.adicionar(2, 2),  4);
		assertEquals(calc.adicionar(2, -2) ,  0);
	}
	
	@Test
	void isAddingTwoNumbersWithNegative() {
		assertEquals(calc.adicionar(2, -2) ,  0);
	}
	
	@Test
	void isSubtractiongTwoNumbers() {
		assertEquals(calc.subtrair(0, 0) , 0);
		assertEquals(calc.subtrair(1, 1) , 0);
		assertEquals(calc.subtrair(-1, 1) , -2);
	}
	
	@Test
	void isSubtractiongTwoNumbersWithNegative() {
		assertEquals(calc.subtrair(-1, 1) , -2);
	}
	
	@Test
	void isMultiplingTwoNumber() {

		assertEquals(calc.multiplicar(1, 2), 2);
		assertEquals(calc.multiplicar(2, 2), 4);
		
	}	
	
	@Test
	void isMultiplingByZero() {
		assertEquals(calc.multiplicar(0, 0), 0);
		assertEquals(calc.multiplicar(0, 1), 0);
		assertEquals(calc.multiplicar(1, 0), 0);		
	}
	
	@Test
	void isMultiplingTwoNumberWithNegative() {
		assertEquals(calc.multiplicar(-1, 2), -2);
		assertEquals(calc.multiplicar(2, -2), -4);		
	}
	
	@Test
	void isDividingTwoNumbers() {
		assertEquals(calc.dividir(2, 2), 1);
		assertEquals(calc.dividir(8, 2), 4);
		assertEquals(calc.dividir(2, 8), 0);
	}
	
	@Test
	void isDividingTwoNumbersWithNegative() {
		assertEquals(calc.dividir(2, -2), -1);
		assertEquals(calc.dividir(8, -2), -4);
		assertEquals(calc.dividir(2, -8), -0);
	}
	
	@Test
	void isDividingByZero() {
		assertEquals(calc.dividir(2, 0),0);
		assertEquals(calc.dividir(0, -2), 0);
	}
}
