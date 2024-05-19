package Desafio6;

/**
 * Subclasse Gerente
 * */
public class Gerente extends Funcionario {

    private double participacaoLucros;

    //region ...Constructor
    public Gerente(String nome, int idade, double salario, double participacaoLucros) {
        super(nome, idade, salario);
        this.participacaoLucros = participacaoLucros;
    }
    //endregion

    //region ...Sobrescrevendo o método calcularSalario para gerentes
    @Override
    public double calcularSalario() {
        // Lógica de cálculo de salário para gerentes
        return getSalario() + participacaoLucros;
    }
    //endregion

    //region ...Método para atribuir tarefas (exemplo)
    public void atribuirTarefas() {
        System.out.println("Tarefas atribuídas pelo gerente: " + getNome());
    }
    //endregion

    //region ...Getter and Setter
    public double getBonus() {
        return participacaoLucros;
    }

    public void setBonus(double bonus) {
        this.participacaoLucros = bonus;
    }
    //endregion
}
