package Calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Menu opcaoMenu = new Menu();
        boolean condicao = true;
        int opcao;
        do {

            System.out.println("---Calculadora Simples----");
            System.out.println("Escolha uma opção");
            System.out.println("1-Somar \n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair");
            opcao = read.nextInt();
            read.nextLine();

            switch (opcao) {
                case 1:
                    opcaoMenu.opSomar();
                    break;
                case 2:
                    opcaoMenu.opSubtrair();
                    break;
                case 3:
                    opcaoMenu.opMultiplicar();
                    break;
                case 4:
                    opcaoMenu.opDividir();
                    break;
                case 5:
                    condicao = false;
                    System.out.println("Volte sempre!");

                    System.exit(0);

                default:
                    System.out.println("operação invalida");
            }

        } while (condicao);

        read.nextLine();
        read.close();

    }

}
