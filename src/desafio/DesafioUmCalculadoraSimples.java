package desafios; // Declaração do pacote

import java.util.Scanner; // Importa a classe Scanner para entrada do usuário

// Classe para representar uma calculadora
class Calculadora {
    // Atributos para armazenar dois números
    double numero1;
    double numero2;

    // Construtor para inicializar os valores
    Calculadora(double numero1, double numero2) {
        this.numero1 = numero1; // Define o primeiro número
        this.numero2 = numero2; // Define o segundo número
    }

    // Método para somar os dois números
    double somar() {
        return numero1 + numero2;
    }

    // Método para subtrair o segundo número do primeiro
    double subtrair() {
        return numero1 - numero2;
    }

    // Método para multiplicar os dois números
    double multiplicar() {
        return numero1 * numero2;
    }

    // Método para dividir o primeiro número pelo segundo
    double dividir() {
        if (numero2 == 0) { // Verificação de divisão por zero
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return numero1 / numero2;
    }
}

// Classe principal para testar a Calculadora com entrada do usuário
public class DesafioUmCalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criação do Scanner para entrada do usuário

        // Solicitar entrada do usuário
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble(); // Lê o primeiro número do usuário

        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble(); // Lê o segundo número do usuário

        // Criação de uma calculadora com valores do usuário
        Calculadora calculadora = new Calculadora(num1, num2);

        // Testando os métodos da calculadora
        System.out.println("Soma: " + calculadora.somar());
        System.out.println("Subtração: " + calculadora.subtrair());
        System.out.println("Multiplicação: " + calculadora.multiplicar());

        try {
            System.out.println("Divisão: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Mensagem de erro para divisão por zero
        }

        scanner.close(); // Fecha o Scanner para evitar vazamentos de recursos
    }
}