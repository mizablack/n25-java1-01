package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		
     Scanner scan = new Scanner(System.in);
     //Utilizando uma estrutura while
     
     String res="";
     
     while(!res.equals("S") && !res.equals("N")) {
    	 System.out.println("Digite S ou N:");
    	 res = scan.nextLine();
    	  }
     System.out.println("Saiu!");
     scan.close();
     
	}

}
