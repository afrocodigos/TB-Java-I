package funcionario;

public class Gerente extends Funcionario {
	
	private double bonus;
		
	public Gerente(String nome, int idade, double salario, String departamento, double bonus) {
        super(nome, idade, salario,"Gerente", departamento);
        this.bonus = bonus;
    }

	// Getter e Setter para o atributo bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double calcularBonusAnual() {
    	return bonus * 12;
    }

    // Sobrescrita do método calcularSalario()
    @Override
    public double calcularSalario() {
        // Salário do gerente é o salário base mais o bônus
        return getSalario() + bonus;
    }
}
