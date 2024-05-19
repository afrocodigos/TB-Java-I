package Desafio6;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    //region ...Constructor
    public Funcionario() {}

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    //endregion

    //region ...Método para calcular o salário (será sobrescrito nas subclasses)
    public double calcularSalario() {
        return salario;
    }
    //endregion

    //region ...Getter and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //endregion
}
