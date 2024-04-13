package Desafio3;

public class TrianguloSimples {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5, 5, 5);
        Triangulo triangulo2 = new Triangulo(5, 5, 6);
        Triangulo triangulo3 = new Triangulo(3, 4, 5);

        System.out.println("Triângulo 1: " + triangulo1.tipoTriangulo());
        System.out.println("Triângulo 2: " + triangulo2.tipoTriangulo());
        System.out.println("Triângulo 3: " + triangulo3.tipoTriangulo());
    }
}
