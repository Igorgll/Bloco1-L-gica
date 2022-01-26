package Introducao;

import java.util.Scanner;

public class listaExercicios1 {
	
	public static void main (String [] args) {
		
		int dia, mes, ano, mesDias, anosDias, idade, idadeDias;	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu dia de nascimento: ");
			
			dia = leia.nextInt();
			
			System.out.println("Digite seu mês de nascimento: ");
			
				mes = leia.nextInt();
			
			System.out.println("Digite seu ano de nascimento: ");
			
				ano = leia.nextInt();
				
				System.out.println("Sua data de nascimento é: " + dia + "/"+ mes+ "/" +ano);
				
				
			idade = 2021 - ano;
			
			mesDias = mes * 30;
			
			anosDias = idade * 365;
			
			idadeDias = idade + mesDias + anosDias;
			
			System.out.println("Sua idade em dias é aproximadamente: " + idadeDias);
				
		
	}

}
