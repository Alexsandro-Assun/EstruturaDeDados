package Exercicios;

public class IdadeEmDias {

	public static void main(String[] args) {
		int idade = 800;
		int ano = idade / 365;
		int meses = idade % 365 /30;
		int dia = idade % 365 % 30;
		
		System.out.println("Anos : "+ ano);
		System.out.println("Meses: "+ meses);
		System.out.println("Dias : "+ dia);
		

	}

}
