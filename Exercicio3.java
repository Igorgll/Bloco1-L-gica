package Introducao; 

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String []args) {
		
		 
		int minutos, segundos, horas;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite a duração do evento em segundos: ");
			segundos = leia.nextShort(); 
			
			
		horas = segundos / 3600; // saber a hora a partir dos segundos
		minutos = horas * 60; //saber os minutos a partir das horas
			
		System.out.println("A duração do evento em segundos é: " + segundos);	
		System.out.println("em minutos: " + minutos);
		System.out.println("e horas: " + horas);
		
							
	}

}
