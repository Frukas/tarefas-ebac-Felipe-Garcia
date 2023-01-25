package com.br.mod19;

public class Main {

	public static void main(String[] args) {
		
		TableInfo tablename = new TableInfo();
		Reflexion rf = new Reflexion();
		
		rf.printAnotation(tablename.getClass());
		
	}
}
