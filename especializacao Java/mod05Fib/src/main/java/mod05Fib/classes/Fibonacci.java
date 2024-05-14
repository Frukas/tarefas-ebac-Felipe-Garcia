package mod05Fib.classes;

public class Fibonacci {
	
	public static long fibonacci(long n) {		
		n = n - 1;
		return calcFibonacci(n);
	}
	
	private static long calcFibonacci(long n) {
	    if (n <= 1) {
	        return n;
	    }
	    return calcFibonacci(n - 1) + calcFibonacci(n - 2);
	}
}
