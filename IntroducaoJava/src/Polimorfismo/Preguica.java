package Polimorfismo;

public class Preguica implements Animal {

	@Override
	public void nome(String nome) {
		System.out.println("Preguica");
	}

	@Override
	public void idade(int idade) {
		System.out.println("Idade: " + 4);
	}

	@Override
	public void emitirSom(String emitirSom) {
		System.out.println("emitiu som de mamífero");
	}

	@Override
	public void correr(String correr) {
		System.out.println("subiu na árvore...");
	}
	
	
}
