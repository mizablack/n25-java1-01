package br.com.senaisp.bauru.aula06;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int idade;
   do {
	   
   try {
	System.out.println("Digite sua Idade: ");
	    idade = scan.nextInt();
	       System.out.println("Voce naceu em  "  + (2025 - idade));
} catch (Exception e) {
	// TODO Auto-generated catch block
	idade = 0;
	System.out.println("Voce Digitou uma idade invalida!");
	scan.nextLine();//Captura o valor co erro
	               // para não ficar emloop
}
       
   } while(idade<=0); 
       scan.close();
	}

}
