package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double lado1;
        double lado2;
        double lado3;

        System.out.println(" - - - IDENTIFICADOR DE TRIANGULO - - -");
        System.out.print("Valdor do lado 01: ");
        lado1 = input.nextDouble();
        System.out.print("Valdor do lado 02: ");
        lado2 = input.nextDouble();
        System.out.print("Valdor do lado 03: ");
        lado3 = input.nextDouble();

        Triangulo qualTriangulo = new Triangulo(lado1, lado2, lado3);
        System.out.println();
        System.out.println("O triangulo é " + qualTriangulo.tipoTriangulo());

    }
}
