package funcionario;

public class FuncionarioRegular extends Funcionario {

	public FuncionarioRegular(String nome, int idade, double salario, String departamento) {
		super(nome, idade, salario, "Funcionário Regular", departamento);
		
	}
	
	@Override
	public double calcularSalario() {
		return getSalario();
	}

	public double calcularBonus() {
		
		return 0.05 * getSalario();
		
	}
}

