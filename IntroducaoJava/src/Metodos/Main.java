package Metodos;

public class Main {
	
	public static void main (String []args ) {
		Cliente pessoa = new Cliente(); 
		
	pessoa.setNome("Igor");
	pessoa.setIdade(21);
	pessoa.setCPF("000.000.000-0");
				
	System.out.println("Seu nome: " + pessoa.getNome());			
	System.out.println("Idade: " + pessoa.getIdade());	
	System.out.println("CPF: " + pessoa.getCPF());
	pessoa.correr();
	
	
	Aviao transporte = new Aviao();
	
		transporte.setModelo("Comercial");
		transporte.setCompaniaAeria("GOL");
		transporte.setquantidadeAssentos(350);
		
		System.out.println("O modelo do avião: " + transporte.getModelo());
		System.out.println("A compania aeria: " + transporte.getCompaniaAeria());
		System.out.println("Quantidade de assentos: " + transporte.quantidadeAssentos);
		transporte.voar();

		
	Eletronico dispositivo = new Eletronico();
	
		dispositivo.setModelo("Samsung");
		dispositivo.setTamanho("6 polegadas");
		dispositivo.setCor("Preto");
		dispositivo.setPreco(899.00);
		
		System.out.println("O modelo do celular: " + dispositivo.getModelo());
		System.out.println("Tamanho da tela: " + dispositivo.getTamanho());
		System.out.println("Cor: " + dispositivo.getCor());
		System.out.println("Preço: " + dispositivo.getPreco());
		
		dispositivo.tirarFoto();
		
		
	Funcionario person = new Funcionario();	
		
		person.setNome("Olávo");
		person.setnumeroIdentificacao(19);
		person.setSalario(1500.0);
		
		
		System.out.println("Nome: " + person.getNome());
		System.out.println("Numero de identificação: " + person.getnumeroIdentificacao());
		System.out.println("Salário: " + person.salario);
		
		person.trabalhar();
	
	Patinete veiculo = new Patinete();	
		
		veiculo.setCor("Marrom");
		veiculo.setquantidadeRodas(4);
		
		System.out.println("A cor do patinete: " + veiculo.getCor());
		System.out.println("Quantidade de rodinhas: " + veiculo.getquantidadeRodas());
		
		veiculo.freiar();
		
		
	ContaBancaria conta = new ContaBancaria();
	
		conta.setNome("Carina");
		conta.setnumeroConta("0000000-0");
		conta.setbanco("Itaú");
		
		conta.transferir();
		
		
	Paciente someone = new Paciente();
	
		someone.setNome("Luciana");
		someone.sethorarioConsulta("16:30");
		
		someone.marcarConsulta();
		
		
		
	}
	
}
