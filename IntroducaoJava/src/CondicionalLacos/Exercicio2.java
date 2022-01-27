package CondicionalLacos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x = 0, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in); 
			
		
		for(int i = 0; i < 10; i++) { 
			System.out.println("Digite um número: ");
				x = leia.nextInt();
				
			System.out.println(x);	
		
			if( x % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
								
		System.out.println("Número de pares: " + par);
		System.out.println("\nNúmero de ímpares: " + impar);
				
}
}