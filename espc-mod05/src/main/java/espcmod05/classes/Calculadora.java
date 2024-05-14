package espcmod05.classes;

public class Calculadora {
	
	public int adicionar(int a , int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a , int b) {
		return a * b;
	}
	
	public int dividir(int a , int b) {
		if(a == 0 || b == 0)
			return 0;
		
		return a/b;
		}
}
