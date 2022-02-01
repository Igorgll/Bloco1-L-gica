package Metodos;

public class Patinete {
	
	//ATRIBUTOS 
	public String cor;
	public int quantidadeRodas;
		
	
	//GET/SET
	
	public String getCor() {
		return cor;
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	public int getquantidadeRodas() {
		return quantidadeRodas;
	}
	
	public void setquantidadeRodas (int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
	//METODOS
	
	public void freiar() {
		System.out.println("O patinete freiou !");
	}

}
