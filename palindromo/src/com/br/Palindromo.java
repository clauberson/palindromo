package com.br;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Palindromo {
	public static void main(String[] args) {
		try{
			Scanner arquivo = new Scanner(new FileReader("c:\\Lista-de-Palavras.txt"));
			String linha;
			System.out.println("Entrada\t\t\tSaída");
			while (arquivo.hasNext()) {
				linha = arquivo.next();
				System.out.println(linha+"\t\t\t"+verificaPali(linha));
			}
			arquivo.close();
			System.gc();
		} catch(IOException e){			
			System.err.printf("Erro ao processar arquivo.\n", e.getMessage());
		}
	}
	
	public static String verificaPali(String palavra) {  
        String retorno;
        StringBuffer inverso = new StringBuffer(palavra);  
        if(palavra.equals(inverso.reverse().toString())) {  
            retorno = "sim";
        } else {  
        	retorno = "não";  
        }  
        
        return retorno;
    }  

}
