package desafio02;

public class FuncionarioRegular extends Funcionario{
    public String cargo;

    public FuncionarioRegular(String nome, int idade, double salarioBase, String departamento, String cargo) {
        super(nome, idade, salarioBase, departamento);
        this.cargo = cargo;
    }

    @Override
    public double calculaSalario() {
        return this.salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}