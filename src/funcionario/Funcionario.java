package desafio02;

public abstract class Funcionario {
    protected String nome;
    protected int idade;
    protected double salarioBase;
    protected String departamento;

    public Funcionario(String nome, int idade, double salarioBase, String departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public abstract double calculaSalario();

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}