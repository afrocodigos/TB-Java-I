package Calculadora;

import java.util.Scanner;

public class Menu {

    public void opSomar() {

        System.out.println("Operação Somar");
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);

        System.out.println("resultado :" + op.somarValor());
        read.nextLine();
        read.close();

    }

    public void opSubtrair() {

        System.out.println("Opração Subtração");

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        System.out.println("resultado: " + op.subtrairValor());
        read.nextLine();
        read.close();

    }

    public void opMultiplicar() {

        System.out.println("Opração Multiplicação");
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        System.out.println("resultado : " + op.multiplicarValor());
        read.nextLine();
        read.close();

    }

    public void opDividir() {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        System.out.println("resultado : " + op.dividirValor());
        read.nextLine();
        read.close();

    }

}
