package Introducao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String[] args) {
		
		int a, b, c;
		double d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero para A: ");
			a = leia.nextInt();
		
			System.out.println("Digite um numero para B: ");
				b = leia.nextInt();
			
			
			System.out.println("Digite um numero para C: ");
				c = leia.nextInt();
			
		r = Math.pow((a + b), 2);	
		
		s = Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
				System.out.println("R: " + r);
				System.out.println("S: " + s);
				System.out.println("D: " + d);
				
				
	}

}
