package Introducao;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String [] args) {
		
		int anos, meses, dias, total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");

			dias = leia.nextInt();	
			
		anos = dias / 365;
		
		meses = dias % 365 / 30; // o resto da divisao de anos e 30 representa os meses
		
		dias = dias % 365 % 30;
		
		
		System.out.println("Você tem: " + anos +  "anos");
		System.out.println(meses + "meses");
		System.out.println(dias + "dias");
		
		
		
	}

}
