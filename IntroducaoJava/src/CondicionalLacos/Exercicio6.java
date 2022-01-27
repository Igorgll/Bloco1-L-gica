package CondicionalLacos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int numero = 0, media = 0, soma = 0, vezes = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			if (numero % 3 == 0) {

				vezes++;
				soma = soma + numero;

			}

		} while (numero != 0);

		media = (media + soma) / vezes;

		System.out.println("A media dos número digitados múltiplos de 3 são: " + media);

	}

}
