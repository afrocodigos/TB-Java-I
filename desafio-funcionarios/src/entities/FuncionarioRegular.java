package entities;

public class FuncionarioRegular extends Funcionario{

    public FuncionarioRegular(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.1;
    }
}
