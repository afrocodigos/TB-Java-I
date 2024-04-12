package Calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("---Calculadora Simples----");
        System.out.println("Escolha uma opção");
        System.out.println("1-Somar \n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair");
        int opcao = read.nextInt();
        read.nextLine();
        read.close();

        while (true) {

            switch (opcao) {
                case 1:
                    opSomar();
                    break;
                case 2:
                    opSubtrair();
                    break;
                case 3:
                    opMultiplicar();
                    break;
                case 4:
                    opDividir();
                case 5:
                    System.out.println("Volte sempre!");
                    System.exit(0);

                default:
                    System.out.println("operação invalida");
                    break;
            }

        }

    }

    public static void opSomar() {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        Double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        Double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        op.somarValor();
        read.close();

    }

    public static void opSubtrair() {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        Double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        Double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        op.subtrairValor();
        read.close();

    }

    public static void opMultiplicar() {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        Double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        Double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        op.multiplicarValor();
        read.close();

    }

    public static void opDividir() {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        Double numberX = read.nextDouble();
        read.nextLine();
        System.out.println("Digite o valor 2:");
        Double numberY = read.nextDouble();
        read.nextLine();
        Calculadora op = new Calculadora(numberX, numberY);
        op.dividirValor();
        read.close();

    }
}
