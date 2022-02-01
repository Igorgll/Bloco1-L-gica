package Metodos;

public class ContaBancaria {
	
	//ATRIBUTOS
	public String nome;	
	public String numeroConta;	
	public String banco;
		
	//GET/SET
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getnumeroConta() {
		return numeroConta;
	}
	
	public void setnumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getbanco() {
		return banco;
	}
	
	public void setbanco(String banco) {
		this.banco = banco;
	}
	

	//METODOS
	
	public void transferir() {
		System.out.println(this.nome + " está transferindo para " + this.banco + " conta: " + this.numeroConta);
	}

}
