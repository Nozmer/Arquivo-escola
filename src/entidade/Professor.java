package entidade;
import java.util.Date;

public class Professor extends Pessoa {
	public double salario;
	public String disciplina;
	
	
	public Professor(String nome, String cpf, String data_nascimento, double salario, String disciplina) {
		super(nome, cpf, data_nascimento);
	}
	
	@Override
	public double tirarCopia(int qts) {
		return 0.10 * (double) qts;
	}
}
