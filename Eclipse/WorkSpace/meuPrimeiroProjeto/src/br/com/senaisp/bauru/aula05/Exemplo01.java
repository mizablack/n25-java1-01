package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Delimitador padrão é espaço em branco
		System.out.println("Digite 3 nùmeros espaçando-os: ");
		int nr1 = scan.nextInt();
		int nr2 = scan.nextInt();
		int nr3 = scan.nextInt();
		System.out.println("Os valores digitado foram");
		System.out.println(nr1 + " - " + nr2 + " - " + nr3);
		scan.close();
		
	}

}
