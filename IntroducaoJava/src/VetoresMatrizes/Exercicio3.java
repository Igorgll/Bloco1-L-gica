package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] n1 = new int [4][6]; 
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		
		int linha, coluna, subtracao, x = 0, y = 0;
		
		for(linha = 0; linha < 4; linha++) 
		{
			for(coluna = 0; coluna < 6; coluna++) 
			{
				System.out.println("Digite os valores para a primeira matriz: ");
					n1 [linha][coluna] = leia.nextInt();
						x = n1[linha][coluna]; 
						
				System.out.println("Digite os valores para a segunda matriz: ");
					n2 [linha][coluna] = leia.nextInt();
						y = n2[linha][coluna];
						
				m1 [linha][coluna] = x + y;
				m2 [linha][coluna] = x - y;
				
				System.out.println("\n");
			}
		}
		
		for(linha = 0; linha < 4; linha++) {
			
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.println(m1[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}
		
		
		for(linha = 0; linha < 4; linha++) {
			
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.println(m2[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}
	}

}
