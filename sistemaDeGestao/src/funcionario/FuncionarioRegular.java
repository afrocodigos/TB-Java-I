package funcionario;

public class FuncionarioRegular extends Funcionario {

	public FuncionarioRegular(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	
	@Override
	public double calcularSalario() {
		return getSalario();
	}

}

