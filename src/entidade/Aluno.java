package entidade;

public class Aluno extends Pessoa {
	public int matricula;
	
	public Aluno(String nome, String cpf, String data_nascimento) {
		super(nome, cpf, data_nascimento);
	}
	
	public Aluno(String nome, String cpf, String data_nascimento, int matricula) {
		super(nome, cpf, data_nascimento);
		this.matricula = matricula;
	}
	
	public double tirarCopia(int qts) {
		return 0.10 * (double) qts;
	}
}
