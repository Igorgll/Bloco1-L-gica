package Introducao;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[] args) {
		
		int a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um valor para A: ");
			a = leia.nextInt();
		
			System.out.println("Digite um valor para B: ");
				b = leia.nextInt();
			
				System.out.println("Digite um valor para C: ");
					c = leia.nextInt();
			
					System.out.println("Digite um valor para D: ");
						d = leia.nextInt();
			
						System.out.println("Digite um valor para E: ");
							e = leia.nextInt();
			
							System.out.println("Digite um valor para F: ");
								f = leia.nextInt();
								
								
		x = (c * e) - (b * f) / (a * e) - (b * d);
		
		y = (a * f) - (c * d) / (a * e) - (b * d);
		
		
		System.out.println("Os valores de X e Y é: " + x + " e " + y);
		
		
		
	}

}
