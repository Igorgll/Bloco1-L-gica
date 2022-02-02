package Herancas;

public class Main {

	public static void main (String[] args) {
		Cachorro animal1 = new Cachorro();
				
			animal1.setNome("Cachorro");
			animal1.setIdade(3);
	
			System.out.println("Animal: " + animal1.getNome());
			System.out.println("Idade: " + animal1.getIdade());
	
			animal1.emitirSom();
			animal1.correr();
	
		
		Cavalo animal2 = new Cavalo();	
	
			animal2.setNome("Cavalo");
			animal2.setIdade(5);
			
			System.out.println("Animal: " + animal2.getNome());
			System.out.println("Idade: " + animal2.getIdade());

			animal2.emitirSom();
			animal2.correr();
			
		Preguica animal3 = new Preguica();
		
			animal3.setNome("Preguiça");
			animal3.setIdade(30);
		
			System.out.println("Animal: " + animal3.getNome());
			System.out.println("Idade: " + animal3.getIdade());
		
			animal3.emitirSom();
			animal3.subirArvores();
			
		
	}
	
}