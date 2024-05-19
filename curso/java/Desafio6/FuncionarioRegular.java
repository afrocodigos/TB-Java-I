package Desafio6;

/**
 * Subclasse FuncionarioRegular com o conceito de herançca
 * */
public class FuncionarioRegular extends Funcionario{

    private double bonus;

    //region ...Constructor
    public FuncionarioRegular(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }
    //endregion

    //region ...Sobrescrevendo o método calcularSalario para funcionários regulares
    @Override
    public double calcularSalario() {
        // Lógica de cálculo de salário para funcionários regulares
        return getSalario() + bonus;
    }

    // Método para solicitar férias (exemplo)
    public void solicitarFerias() {
        System.out.println("Férias solicitadas para o funcionário regular: " + getNome());
    }
    //endregion

    //region ... Getter and Setter

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //endregion
}
