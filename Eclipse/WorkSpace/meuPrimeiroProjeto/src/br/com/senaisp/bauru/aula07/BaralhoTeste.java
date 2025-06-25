package br.com.senaisp.bauru.aula07;

public class BaralhoTeste {

	public static void main(String[] args) {
		
     Baralho bar = new Baralho();
     Carta1 ct;
     do {
    	 ct = bar.getCartaSorteada();
    	System.out.println(ct);
	} while(bar.getNunCartasDisp()>0);
     
	}

}
