package CRUD_Colaborador;

/*Crie um programa que armazene os seguintes dados: nome do funcionário,
 salário e cargo e crie um crud funcionario*/

public class Funcionario {

    private String nome;
    private Double salario;
    private String cargo;

    public Funcionario(String nome, Double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
