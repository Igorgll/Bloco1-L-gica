package Metodos;

public class Cliente {

	//ATRIBUTOS
	public String nome;
	public String cpf;
	public int idade;
	
	//get/set
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String name) 
	{
		this.nome = name;
	}
	
	public String getCPF() 
	{
		return cpf;
	}
	
	public void setCPF(String cPF) 
	{
		this.cpf = cPF;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	} 
	
	
	//Métodos
	
	public void correr() { 
		System.out.println(this.nome + " está correndo ! ");
	}
		
	
}
