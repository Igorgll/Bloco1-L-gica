package Metodos;

public class Eletronico {
	
	//ATRIBUTOS 
	
	public String modelo;
	public String tamanho;
	public String cor; 
	public double preco;
	
	//set/get
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) 
	{
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	//METODOS
	
	public void tirarFoto() {
		System.out.println(this.modelo + " tirou uma foto ! ");
	}
	
	
	
}
