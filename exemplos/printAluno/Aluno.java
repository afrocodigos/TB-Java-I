import java.util.Scanner;

public class Aluno {
    public String nome;
    public String raca;
    public int idade;

    public Aluno(String nomeAluno, String racaAluno, int idadeAluno){
        this.nome = nomeAluno;
        this.raca = racaAluno;
        this.idade = idadeAluno;
    }

    public void imprimirDadosAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Raça do aluno: " + raca);
        System.out.println("Idade do aluno: " + idade);
    }

    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        String nomeDoAluno = entradaTeclado.nextLine();

        System.out.println("Qual a raça do aluno?");
        String racaDoAluno = entradaTeclado.nextLine();

        System.out.println("Qual a idade do aluno?");
        int idadeDoAluno = entradaTeclado.nextInt();

        entradaTeclado.nextLine();

        Aluno aluno1 = new Aluno(nomeDoAluno, racaDoAluno, idadeDoAluno);
        System.out.println("-------- DADOS DO ALUNO --------");
        aluno1.imprimirDadosAluno();
    }
}