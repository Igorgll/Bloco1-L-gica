package CondicionalLacos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int idade, estado = 0, numeroPessoasCalmas = 0, numeroMulheresNervosas = 0, numeroHomensAgressivos = 0,
				numeroOutrosCalmos = 0;
		int numeroPessoasNervosas40 = 0, numeroPessoasNervosas = 0, numeroPessoasAgressivas = 0,
				numeroPessoasCalmas18 = 0, feminino = 0, masculino = 0, outros = 0, sexo, vezes = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("\nDigite 1 para sexo masculino, 2 para sexo feminino, 3 para outros: ");
			sexo = leia.nextInt();

			if (sexo == 1) {
				masculino++;
			} else if (sexo == 2) {
				feminino++;
			} else if (sexo == 3) {
				outros++;
			} else {
				System.out.println("Op��o inv�lida");
			}

			System.out.println("Digite 1 se voc� for calmo(a), 2 se era nervoso(a, 3 se voc� era agressivo(a)");
			estado = leia.nextInt();

			if (estado == 1) {
				numeroPessoasCalmas++;
			}

			if (estado == 2) {
				numeroPessoasNervosas++;
			}

			if (estado == 3) {
				numeroPessoasAgressivas++;
			}

			if (sexo == 2 && estado == 2) {
				numeroMulheresNervosas++;
			}

			if (sexo == 1 && estado == 3) {
				numeroHomensAgressivos++;
			}

			if (sexo == 3 && estado == 1) {
				numeroOutrosCalmos++;
			}

			if (idade > 40 && estado == 2) {
				numeroPessoasNervosas40++;
			}

			if (idade < 18 && estado == 1) {
				numeroPessoasCalmas18++;
			}

			vezes++;

		} while (vezes < 1);

		System.out.println("O n�mero de pessoas calmas � de: " + numeroPessoasCalmas);
		System.out.println("\nO n�mero de mulheres nervosas � de: " + numeroMulheresNervosas);
		System.out.println("\nO n�mero de homens agressivos � de: " + numeroHomensAgressivos);
		System.out.println("\nO n�mero de outros calmos � de: " + numeroOutrosCalmos);
		System.out.println("\nO n�mero de pessoas nervosas acima de 40 anos � de: " + numeroPessoasNervosas40);
		System.out.println("\nO n�mero de pessoas calmas abaixo de 18 anos � de: " + numeroPessoasCalmas18);

	}

}
