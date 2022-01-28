package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] vetor = new int[10];
		int media = 0, soma = 0, maior = 0, dado = 0, quantidade = 0;

		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println("Digite o numero sorteado no dado: ");
			dado = leia.nextInt();

			vetor[posicao] = dado;

			if (dado > maior)
				maior = dado;

			soma += vetor[posicao];

		}

		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.print(vetor[posicao] + " | ");

			if (vetor[posicao] == maior) {
				quantidade++;
			}

		}

		media = (media + soma) / 10;

		System.out.println("A média aritmética dos lançamentos é: " + media);
		System.out.println("\nNúmero de ocorrência da maior pontuação: " + maior);
		System.out.println("\nNúmero de vezes da que aparece a maior pontuação: " + quantidade);

	}
}
