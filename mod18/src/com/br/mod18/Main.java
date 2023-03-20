package com.br.mod18;

import com.br.mod18.Anotation.TableName;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@TableName("AnyName")
		String newTable;
		
		newTable = "Qulquer coisa so para parar de dar erro";
		
		System.out.print(newTable);
		
	}
}
