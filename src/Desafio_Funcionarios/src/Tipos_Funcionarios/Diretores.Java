// criado classe para funcionários tipo Diretor
package Tipos_Funcionarios;

public class Diretores extends Funcionarios{
    public Diretores(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario() * 1.5 + 1000.0;
    }
}