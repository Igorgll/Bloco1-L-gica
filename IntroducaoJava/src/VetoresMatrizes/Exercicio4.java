package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0;

		for (int x = 0; x < 3; x++) {

			for (int y = 0; y < 3; y++) {

				System.out.println("Digite um valor: ");
				matriz[x][y] = leia.nextInt();

				soma = soma + matriz[x][y];

				if (matriz[x] == matriz[y])
					somaDiagonal = somaDiagonal + matriz[x][y];

			}

		}

		System.out.println("A soma das matriz é: " + soma);
		System.out.println("A soma da diagonal é: " + somaDiagonal);

	}

}
