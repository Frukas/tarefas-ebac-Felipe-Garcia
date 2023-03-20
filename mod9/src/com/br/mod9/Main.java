package com.br.mod9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer newValueInteger;
		int res;
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um numero int: ");
        
        res = in.nextInt();
        
        newValueInteger = Integer.valueOf(res);
	     
	    System.out.println("Valor convertido em Integer: " + newValueInteger);
	    
	    in.close();

	}

}
