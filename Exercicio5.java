package Introducao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String[] args) {
		
		int nota1, nota2, nota3; 
		
		double media = 0;
	
		Scanner leia = new Scanner(System.in);	
		
		
		System.out.println("Digite sua primeira nota: ");
			nota1 = leia.nextInt();
			
			System.out.println("Digite sua segunda nota: ");	
				nota2 = leia.nextInt();
			
			
			System.out.println("Digite sua terceira nota: ");
				nota3 = leia.nextInt();
			
				
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10; 	
				
				
		System.out.println("Sua média é de: " + media);
		
		
	}

}
