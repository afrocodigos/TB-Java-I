package escola;

import java.util.Scanner;

import escola.empregado.Empregado;
import escola.estudante.Estudante;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual o nome do aluno ?");
        String nome = read.nextLine();

        System.out.println("Qual o endereço do aluno ?");
        String endereco = read.nextLine();

        System.out.println("Qual ano escolar do aluno");
        int anoEscolar = read.nextInt();
        read.nextLine();

        Estudante novoAluno = new Estudante(nome, null, 0);
        novoAluno.comer();
        novoAluno.domir();
        novoAluno.estudar();
        novoAluno.matricular();

        System.out.println("Qual o nome do trabalhador ?");
        String nome1 = read.nextLine();

        System.out.println("Qual o endereço do trabalhador ?");
        String endereco1 = read.nextLine();

        System.out.println("Qual a categoria do trabalhador ?");
        String categoria = read.nextLine();
        System.out.println("Qual a função do trabalhador ?");
        String funcao = read.nextLine();

        Empregado pessoa = new Empregado(nome, endereco, categoria, funcao);
        pessoa.comer();
        pessoa.domir();
        pessoa.baterCartao();
        pessoa.trabalhar();

    }

}
