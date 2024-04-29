package desafios; // Declaração do pacote

import java.util.Scanner; // Para entrada do usuário

// Classe para representar um triângulo
class Triangulo {
    double lado1; // Primeiro lado do triângulo
    double lado2; // Segundo lado do triângulo
    double lado3; // Terceiro lado do triângulo

    // Construtor para inicializar os lados do triângulo
    Triangulo(double lado1, double lado2, double lado3) {
        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            throw new IllegalArgumentException("Os valores não formam um triângulo."); // Verificação da Desigualdade Triangular
        }
        this.lado1 = lado1; // Inicializa o primeiro lado
        this.lado2 = lado2; // Inicializa o segundo lado
        this.lado3 = lado3; // Inicializa o terceiro lado
    }

    // Método para verificar o tipo de triângulo
    String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero"; // Todos os lados iguais
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles"; // Dois lados iguais
        } else {
            return "Escaleno"; // Todos os lados diferentes
        }
    }
}

// Classe principal para testar o Triângulo
public class DesafioDoisVerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para entrada do usuário

        // Solicitar entrada do usuário para os lados do triângulo
        System.out.print("Insira o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble(); // Primeiro lado do usuário

        System.out.print("Insira o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble(); // Segundo lado do usuário

        System.out.print("Insira o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble(); // Terceiro lado do usuário

        try {
            // Criação de um triângulo com valores do usuário
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3); // Se não for um triângulo, lança exceção

            // Verificação do tipo de triângulo
            System.out.println("Tipo do Triângulo: " + triangulo.tipoTriangulo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Mensagem de erro se não for um triângulo
        }

        scanner.close(); // Fecha o Scanner
    }
}