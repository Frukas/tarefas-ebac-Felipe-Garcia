package mod05Fib.classes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mod05Fib.classes.Fibonacci;

class FibonacciTest {
	
	@Test
	void fibonacciInTheFirstElement() {
		
		assertEquals(Fibonacci.fibonacci(1), 0);		
	}
	
	@Test
	void fibonacciInTheSecondElement() {
		
		assertEquals(Fibonacci.fibonacci(2), 1);		
	}

	@Test
	void fibonacciInThe10thElement() {
		
		assertEquals(Fibonacci.fibonacci(10), 34);		
	}

}
