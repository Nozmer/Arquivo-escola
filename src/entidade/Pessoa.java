package entidade;

public class Pessoa {
	public String nome;
	public String cpf;
	public String data_nascimento;
	
	public Pessoa() {	
	}
	
	public Pessoa(String nome, String cpf, String data_nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
	}
	
	@Override
	public double tirarCopia(int qts) {
		return 0.10 * (double) qts;
	}

}

