package funcionarios;

public class FuncionarioGeral {
    protected String nome;
    protected int idade;
    protected double salario;

    public FuncionarioGeral(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public double promover() {
        double totalSalario = getSalario() * 12;
        double somaTotal = totalSalario * 5 / 12;
        return somaTotal;
    }
}
