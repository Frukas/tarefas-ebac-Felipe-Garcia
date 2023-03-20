package br.com.mod5;

public class Main {

    public static void main(String[] args) {

        String name = "";

        if(args.length > 0){
            name = makeFrase(args);
        }                    
        
        System.out.println("Hello World! " + name );      
    }
	
    private static String makeFrase(String[] args)    
    {
        StringBuilder frase = new StringBuilder();
        for(String a : args){
            frase.append(a);
            frase.append(" ");
        }
        return frase.toString().trim();
    }
}