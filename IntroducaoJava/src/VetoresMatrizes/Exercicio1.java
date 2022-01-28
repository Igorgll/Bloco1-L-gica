package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] vet = new int[5];
		int maior = 0;

		for (int x = 0; x < 5; x++) {

			System.out.println("Digite um valor: ");
			vet[x] = leia.nextInt();

			if (vet[x] > maior) {
				maior = vet[x];
			}

		}

		for (int x = 0; x < 5; x++) {

			System.out.print(vet[x] + "\t");

		}

		System.out.println("\nO maior valor digitado é: " + maior);

	}

}
