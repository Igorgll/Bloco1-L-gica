package CondicionalLacos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade = 0, pessoas50 = 0, pessoas21 = 0;

		Scanner leia = new Scanner(System.in);

		while (idade != -99) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0 ) {

				pessoas21++;
			} else if (idade > 50) {

				pessoas50++;
			}
					
		}
		
		System.out.println("Total de pessoas abaixo de 21: " + pessoas21);
		System.out.println("\nTotal de pessoas acima de 50: " + pessoas50);

	}

}
