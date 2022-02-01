package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class lista {

	public static void main(String[] args) {
		ArrayList<String> estoque = new ArrayList<>();
		//criacao da lista estoque
		//DADOS DA LISTA
		estoque.add("Camiseta"); //ITEM A SER REMOVIDO	
		estoque.add("Calça");	
		estoque.add("Meia");	
		estoque.add("Regata");	
		//DADOS DA LISTA
		System.out.println(estoque);
		System.out.println("-------------------------------");
		
		System.out.println("Removendo "+ estoque.remove(0));	
		estoque.add(0, "Shorts");
		System.out.println("\nAtualizando para: " + estoque.get(0));
				
		System.out.println("-------------------------------");
		System.out.println("\n"+ estoque);
		
		
	}

}
