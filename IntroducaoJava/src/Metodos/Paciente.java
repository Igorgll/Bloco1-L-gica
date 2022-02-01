package Metodos;

public class Paciente {
	
	//ATRIBUTOS
	public String nome; 
	public String horarioConsulta;
		
	//GET/SET
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String gethorarioConsulta() {
		return horarioConsulta;
	}
		
	public void sethorarioConsulta(String horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	

	//METODOS
	
	public void marcarConsulta() {
		System.out.println(this.nome + " marcou consulta as " + this.horarioConsulta);
	}

}
