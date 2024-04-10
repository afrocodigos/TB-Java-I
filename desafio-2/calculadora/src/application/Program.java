package application;

import entities.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String sair = "nao";
        while (sair.charAt(0) != 's'){

            System.out.println("- - - - - - - - - - CALCULADORA - - - - - - - - - -");
            System.out.println();
            System.out.print("Insira o primeiro numero: ");
            double n1 = input.nextDouble();
            System.out.print("Insira o segundo numero: ");
            double n2 = input.nextDouble();
            System.out.println();
            System.out.println("- - - - Agora escolha qual ação deseja fazer - - - -");
            System.out.println(" 1 - SOMA | 2 - SUBTRAIR | 3 - MULTIPLICAR | 4 - DIVIDIR");
            System.out.print("-> ");
            double operacao = input.nextDouble();

            while (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4){
                System.out.println("Ação inválida, tente novamente");
                System.out.print("-> ");
                operacao = input.nextDouble();
            }

            if (n2 == 0 && operacao == 4) {
                System.out.println("Não pode dividir por zero");
            } else {
                Calculadora calc = new Calculadora(n1, n2);

                if (operacao == 1) {
                    System.out.println(n1 + " + "+ n2 + " = " + calc.somar());
                } else if (operacao == 2){
                    System.out.println(n1 + " - "+ n2 + " = " + calc.subtrair());
                } else if (operacao == 3) {
                    System.out.println(n1 + " * "+ n2 + " = " +  calc.multiplicar());
                } else if (operacao == 4) {
                    System.out.println(n1 + " / "+ n2 + " = " + calc.dividir());
                }
            }

            System.out.print("Deseja sair? (sim/nao) ");
            input.nextLine();
            sair = input.nextLine();
        }
    }
}
