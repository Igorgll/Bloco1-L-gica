package Polimorfismo;

public class Cachorro implements Animal {

	@Override
	public void nome(String nome) {
		System.out.println("Cachorro");	
	}

	@Override
	public void idade(int idade) {
		System.out.println("Idade: " + 5);
	}

	@Override
	public void emitirSom(String emitirSom) {
		System.out.println("latiu...");
	}

	@Override
	public void correr(String correr) {
		System.out.println("correu");
	}

	
}
