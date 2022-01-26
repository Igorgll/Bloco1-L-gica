package Introducao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		double x1, x2, y1, y2, p1, p2, d;
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite um valor para x1: ");
			x1 = leia.nextDouble();
			
			System.out.println("Digite um valor para x2: ");
			x2 = leia.nextDouble();
			
			System.out.println("Digite um valor para y1: ");
			y1 = leia.nextDouble();
			
			System.out.println("Digite um valor para y2: ");
			y2 = leia.nextDouble();
		
			
			
		p1 = Math.pow((x2-x1), 2);	
		p2 = Math.pow((y2 - y1), 2);
		
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância dos pontos é: " + d);
			
			
	}

}
