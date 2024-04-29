public class DesafioSistemaGestaoFuncionario {
    private String nome; // Nome do funcionário
    private int idade; // Idade do funcionário
    private double salario; // Salário do funcionário

    public DesafioSistemaGestaoFuncionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Métodos de acesso e modificação (getters e setters)
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

    // Método para calcular o salário (para ser sobrescrito por subclasses)
    public double calcularSalario() {
        return salario; // Salário base do funcionário genérico
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Salário: " + salario);
    }
}