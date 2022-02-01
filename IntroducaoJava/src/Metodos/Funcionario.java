package Metodos;

public class Funcionario {

	//ATRIBUTOS
	
	public String nome;
	public int numeroIdentificacao;
	public double salario;	
		
	//set/ get
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getnumeroIdentificacao() {
		return numeroIdentificacao;
	}
	
	public void setnumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
	//METODOS
	
	public void trabalhar() {
		System.out.println(this.nome + " está trabalhando! ");
	}
	
	
	
	
}
