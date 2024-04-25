// criado classe para funcionários tipo Regular
package Tipos_Funcionarios;

public class Funcionarios_Regular extends Funcionarios{

    public Funcionarios_Regular(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.1;
    }
}