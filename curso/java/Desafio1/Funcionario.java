package Desafio1;

import java.util.Scanner;

/**
 *  Desafio 01/04/2024
 * Programa que armazena e imprime os seguintes dados:
 *  - nome do funcionário
 *  - salário
 *  - cargo
 * */
public class Funcionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do(a) funcionário(a): ");
        String nomeFuncionario = sc.nextLine();

        System.out.print("Digite o salário do(a) funcionário(a): ");
        double salarioFuncionario = sc.nextDouble();

        System.out.print("Digite o cargo do(a) funcionário(a): ");
        String cargoFuncionario = sc.next();

        System.out.println(" ========= Dados do(a) Funcionário(a) ========= ");
        System.out.println("Funcionário (a): " + nomeFuncionario);
        System.out.println("Salário: " + salarioFuncionario);
        System.out.println("Cargo: " + cargoFuncionario);

        sc.close();;
    }
}
