// Classe para representar um funcionário
class Funcionario {
    // Atributos para armazenar dados do funcionário
    String nome;
    double salario;
    String cargo;

    // Construtor para inicializar os valores
    Funcionario(String nome, double salario, String cargo) {
        this.nome = nome; // Define o nome do funcionário
        this.salario = salario; // Define o salário
        this.cargo = cargo; // Define o cargo
    }

    // Método para imprimir os dados do funcionário
    void imprimirDados() {
        System.out.println("Nome do Funcionário: " + nome); // Imprime o nome
        System.out.println("Salário: $ " + salario); // Imprime o salário
        System.out.println("Cargo: " + cargo); // Imprime o cargo
    }
}

// Classe principal para rodar o programa
public class PrimeiroDesafioFuncionario {
    public static void main(String[] args) {
        // Crie um objeto Funcionario
        Funcionario funcionario = new Funcionario("Elven's Future", 5000.00, "SME GCP Cloud Engineer");

        // Imprima os dados do funcionário
        funcionario.imprimirDados(); // Imprime os 3 valores no console
    }
}