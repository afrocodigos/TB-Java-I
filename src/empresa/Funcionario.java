package empresa;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int idade;

    public Funcionario(String nome, String cpf, double salario, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", idade=" + idade + ", nome=" + nome + ", salario=" + salario + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Funcionario) {
            Funcionario outro = (Funcionario) obj;
            return this.cpf.equals(outro.cpf);
        }
        return false;
    }
}
