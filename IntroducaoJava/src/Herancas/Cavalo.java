package Herancas;

public class Cavalo extends Animal {
		
	//METODOS 
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome() + " relinchou...");
	}
	
	public void correr() {
		System.out.println(super.getNome() + " correu...");
	}
	
	
}