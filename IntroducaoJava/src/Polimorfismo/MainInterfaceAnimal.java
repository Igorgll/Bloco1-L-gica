package Polimorfismo;

public class MainInterfaceAnimal {

	public static void main(String[] args) {


		Cachorro animal1 = new Cachorro();
		Cavalo animal2 = new Cavalo();
		Preguica animal3 = new Preguica();
	
		animal1.nome("Cachorro");
		animal1.idade(5);
		animal1.emitirSom(" latiu...");
		animal1.correr(" correu");
		
		animal2.nome("Cavalo");
		animal2.idade(6);
		animal2.emitirSom("relinchou...");
		animal2.correr(" galopou");
		
		animal3.nome("Preguiça");
		animal3.idade(4);
		animal3.emitirSom("emitiu som de mamídiero...");
		animal3.correr(" subiu na árvore");
		
		
	}

}
