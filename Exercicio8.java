package Introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main (String[] args) {
		
		//porcentagem do distribuidor = 25%
		//porcentagem dos impostos = 45%
		
		double custoFab, custoCon;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo da fábrica: ");
				custoFab = leia.nextDouble();
		
		
		custoCon = custoFab + (0.28 * custoFab) + (0.45 * custoFab); 		
			//aqui teremos a diferencia de impostos e a porcentagem de distribuidor
			//retornando o que o programa lê em custoFab
				
		
		custoCon = custoCon + (0.45 * custoCon);
		
		System.out.println("O custo do consumidor será de: " + custoCon);
		
				
	}
	
	
}
