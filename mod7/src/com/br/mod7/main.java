package com.br.mod7;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoa jose = new pessoa("Jose", 53, 1.67f, 65.5f);
		
		pessoa maria = new pessoa();
		
		maria.setNome("Maria").setIdade(54).setAltura(1.54f).setPeso(57.1f);
		
		jose.printInfo();
		maria.printInfo();		

	}

}
