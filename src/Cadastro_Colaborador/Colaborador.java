/*Crie um programa que armazene os seguintes dados: nome do funcionário,
 salário e cargo e imprima no console os 3 valores;*/

import java.util.Scanner;

public class Colaborador {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[] nome = new String[3];
        Double[] salario = new Double[3];
        String[] cargo = new String[3];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Qual nome do colaborador ?");
            nome[i] = read.nextLine();

            System.out.println("salario do colaborador ?");
            salario[i] = read.nextDouble();
            read.nextLine();// quebra de linha

            System.out.println("Qual o cargo do colaborador?");
            cargo[i] = read.nextLine();

        }

        for (int i = 0; i < nome.length; i++) {
            if (nome[i] != null) {
                System.out.println("nome : " + nome[i] + " salario: " + salario[i] + " cargo: " + cargo[i]);

            }
        }
        read.close();
    }
}