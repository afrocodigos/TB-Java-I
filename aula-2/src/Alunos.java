import java.util.Scanner;

public class Alunos {
    String nome;
    String raca;
    int idade;

    //método construtor
    public Alunos(String nome, String raca, int idade){

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void imprimirDadosDoAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + idade);
        System.out.println("Idade: " + raca);

    }

    public static void main(String[] args){
        Scanner inputDoTeclado = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = inputDoTeclado.nextLine();

        System.out.println("Digite a raça do aluno: ");
        String raca = inputDoTeclado.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = inputDoTeclado.nextInt();
        inputDoTeclado.nextLine();

        Alunos aluno = new Alunos(nome, raca, idade);

        System.out.println("----------------- DADOS DO ALUNO ----------------");
        aluno.imprimirDadosDoAluno();

        inputDoTeclado.close();

    }

}
