package funcionario;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private String departamento;

    // Construtor
    public Funcionario(String nome, int idade, double salario, String cargo, String departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    // Getters e Setters
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
    
    public void promover(String novoCargo) {
    	this.cargo = novoCargo;
    }

    // Método para calcular o salário (será sobrescrito nas subclasses)
    public double calcularSalario() {
        return salario;
    }
    
    
}

