import java.util.Scanner;

import aluno.*;

public class App {

    

    public void diaDaSemana (int quantidadeDeDias) {
        String dia = null;
        switch (quantidadeDeDias) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda Feira";
                break;
            case 3: 
                dia = "Terça Feira";
                break;
            case 4:
                dia = "Quarta Feira";
            case 5:
                dia = "Quinta Feira";
            case 6:
                dia = "Sexta Feira";
            case 7:
                dia = "Sábado";
            default:
                break;
        }

        System.out.println("Hoje é : " + dia);
    }

    public static void main(String[] args) {
        //instaciar um objeto da classe Scanner
         Scanner inputdoteclado = new Scanner(System.in);

        // System.out.println("Digite o nome do aluno:");
        // String nomeDoAluno = inputdoteclado.nextLine();

        // System.out.println("Digite a raça do aluno:");
        // String racaDoAluno = inputdoteclado.nextLine();

        // System.out.println("Digite a idade do aluno:");
        // int idadeDoAluno = inputdoteclado.nextInt();
        // inputdoteclado.nextLine();
        
        // System.out.println("Digite a media anual do aluno:");
        // float mediaAnualDoAluno = inputdoteclado.nextFloat();

        // Alunos aluno = new Alunos(nomeDoAluno, racaDoAluno, idadeDoAluno, mediaAnualDoAluno);
        // System.out.print("--------- SITUAÇÃO DO ALUNO ----------\n");
        // aluno.alunoAprovado(mediaAnualDoAluno);

        System.out.println("Digite um número:");
        float primeiroNumero = inputdoteclado.nextFloat();

        System.out.println("Digite outro número:");
        float segundoNumero = inputdoteclado.nextFloat();

        float maiorNumero = (primeiroNumero > segundoNumero) ?primeiroNumero : segundoNumero;

        System.out.println("O maior número é:" + maiorNumero);

        inputdoteclado.close();
    }
}
