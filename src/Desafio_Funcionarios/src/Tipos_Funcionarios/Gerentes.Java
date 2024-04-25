// criado classe para funcionários tipo Gerente
package Tipos_Funcionarios;

public class Gerentes extends Funcionarios{
    public Gerentes(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.3;
    }
}