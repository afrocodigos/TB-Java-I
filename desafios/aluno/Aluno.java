package aluno;
import java.util.Scanner;

public class Aluno {
    //atributo da classe
    String nome;
    String raca;
    int idade;
    float mediaAnual;

    //métodos ou funções

    //método construtor - criar/instância um objeto da classe
    public Aluno() {

    }
    public Aluno(String nomeDoAluno, String racaDoAluno, int idadeDoAluno, float mediaAnualDoAluno) {
        this.nome = nomeDoAluno;
        this.raca = racaDoAluno;
        this.idade = idadeDoAluno;
        this.mediaAnual = mediaAnualDoAluno;
    }

    //métodos/funções
    public void imprimirDadosDoAluno() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Raça do aluno: " + raca);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Idade do aluno: " + mediaAnual);
    }

    public boolean alunoAprovado(float mediaAnual) {
        if (mediaAnual >= 6) {
            // se essa condição for verdadeira
            System.out.println("Alune aprovado!");
            return true;
        } else if (mediaAnual <= 5.9 && mediaAnual >=4  ){
            //se essa condição for falsa
            System.out.println("Alune em recuperação!");
            return true;
        } else {
            System.out.println("Alune não passou de ano!");
            return false;
        }
    }




    public static void main(String[] args) {
        //instaciar um objeto da classe Scanner
        Scanner inputdoteclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeDoAluno = inputdoteclado.nextLine();

        System.out.println("Digite a raça do aluno:");
        String racaDoAluno = inputdoteclado.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idadeDoAluno = inputdoteclado.nextInt();
        inputdoteclado.nextLine();
        
        System.out.println("Digite a media anual do aluno:");
        float mediaAnualDoAluno = inputdoteclado.nextFloat();
        inputdoteclado.nextLine();

        Aluno aluno = new Aluno(nomeDoAluno, racaDoAluno, idadeDoAluno, mediaAnualDoAluno);
        System.out.print("--------- SITUAÇÃO DO ALUNO ----------\n");
        aluno.alunoAprovado(mediaAnualDoAluno);

        inputdoteclado.close();
    }
}
