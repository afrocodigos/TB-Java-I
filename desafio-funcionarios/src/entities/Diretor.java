package entities;

public class Diretor extends Funcionario{
    public Diretor(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.2 + 1000.0;
    }
}
