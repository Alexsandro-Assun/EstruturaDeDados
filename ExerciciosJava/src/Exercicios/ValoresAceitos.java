package Exercicios;

public class ValoresAceitos {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 2;
		int d = 6;
		
		if(b > c && d > a && c+d > a+b && c > 0 && d > 0 && a % 2 == 0 ) {
			
			System.out.println("VALORES ACEITOS!!!");
			
		} else {
			System.out.println("VALORES NÃO ACEITOS!!!");
		}

	}

}
