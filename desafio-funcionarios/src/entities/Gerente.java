package entities;

public class Gerente extends Funcionario{
    public Gerente(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.4;
    }
}
