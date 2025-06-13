package br.com.senaisp.bauru.classes;

public class EstudanteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante est = new Estudante();
		est.setNome("Mizael");
		est.setRa(1983);
		System.out.println(est.getNome());
		System.out.println(est ); // Usa o metodo toString()
		Estudante est2 = new Estudante(4567,"João");
		System.out.println(est2);
		Estudante est3 = new Estudante(9999, "Rafael");
		System.out.println(est3);
		

	}

}
