package funcionario;

public class Gerente extends Funcionario {
	
	private double bonus;
	
	public Gerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

	// Getter e Setter para o atributo bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Sobrescrita do método calcularSalario()
    @Override
    public double calcularSalario() {
        // Salário do gerente é o salário base mais o bônus
        return getSalario() + bonus;
    }
}
}
