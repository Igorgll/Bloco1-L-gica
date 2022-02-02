package Herancas;

public class Cachorro extends Animal {
	
	//METODOS
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome() + " latiu...");
	}
	
	public void correr() {
		System.out.println(super.getNome() + " correu...");
	}
	
}