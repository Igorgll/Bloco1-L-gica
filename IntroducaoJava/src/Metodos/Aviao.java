package Metodos;

public class Aviao {
	
	//ATRIBUTOS
		
	public String modelo; 
	public String companiaAeria;
	public int quantidadeAssentos;
	
	//get/set
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public String getCompaniaAeria() 
	{
		return companiaAeria;
	}
	
	public void setCompaniaAeria(String companiaAeria) 
	{
		this.companiaAeria = companiaAeria;
	}
	
	public int getquantidadeAssentos() 
	{
		return quantidadeAssentos;
	}
	public void setquantidadeAssentos(int quantidadeAssentos) 
	{
		this.quantidadeAssentos = quantidadeAssentos;
	} 
	
	//METODOS
	
	public void voar() {
		System.out.println(this.modelo + " está voando ! ");
	}
	
	
	
}
