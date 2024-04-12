package CRUD_Colaborador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Qual nome do colaborador ?");
        String nome = read.nextLine();

        System.out.println("salario do colaborador ?");
        Double salario = read.nextDouble();
        read.nextLine();// quebra de linha

        System.out.println("Qual o cargo do colaborador?");
        String cargo = read.nextLine();

        Funcionario novoFuncionario = new Funcionario(nome, salario, cargo);

        System.out.println("nome:" + novoFuncionario.getNome() + " salario:" + novoFuncionario.getSalario() + " cargo:"
                + novoFuncionario.getSalario());

        read.close();

    }
}
