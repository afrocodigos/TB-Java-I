package Classificar_Triangulo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um valor pro lado 1 :");
        double lado1 = read.nextDouble();
        read.nextLine();
        System.out.println("Digite um valor pro lado 2 :");
        double lado2 = read.nextDouble();
        read.nextLine();
        System.out.println("Digite um valor pro lado 3 :");
        double lado3 = read.nextDouble();
        read.nextLine();

        Triangulo objeto = new Triangulo(lado1, lado2, lado3);
        String tipo = objeto.classificarTriangulo();
        System.out.println("O tipo do triângulo é: " + tipo);

        read.close();
    }

}
