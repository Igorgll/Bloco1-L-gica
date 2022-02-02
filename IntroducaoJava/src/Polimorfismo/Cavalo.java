package Polimorfismo;

public class Cavalo implements Animal {

	@Override
	public void nome(String nome) {
		System.out.println("Cavalo");
	}

	@Override
	public void idade(int idade) {
		System.out.println("Idade: " + 7);
	}

	@Override
	public void emitirSom(String emitirSom) {
		System.out.println("relinchou...");
	}

	@Override
	public void correr(String correr) {
		System.out.println("galopou..");
	}
	
}
