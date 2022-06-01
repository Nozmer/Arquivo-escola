package entidade;

public class Funcionario extends Pessoa {
	public double salario;
	public String data_admissao;
	public String cargos;
	
	public Funcionario(String nome, String cpf, String data_nascimento) {
		super(nome, cpf, data_nascimento);
	}

	public Funcionario(String nome, String cpf, String data_nascimento, double salario, String data_admissao, String cargos) {
		super(nome, cpf, data_nascimento);
		this.salario = salario;
		this.data_admissao = data_admissao;
		this.cargos = cargos;
	}
	
}
