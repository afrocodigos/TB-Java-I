
import java.util.Scanner;

import biblioteca.Funcionario;
import biblioteca.Usuario;
import biblioteca.Livro;

public class Main {

    public static void main(String[] args) {

        boolean condicao = true;
        Scanner read = new Scanner(System.in);

        while (condicao) {
            System.out.println("Seja bem-vido\nEscolha 1-Usuário 2-Funcionário 0-Sair");
            int opcao = read.nextInt();
            read.nextLine();

            switch (opcao) {
                case 1:
                    menuUsuario();

                    break;
                case 2:
                    menuFuncionario();
                    break;

                case 0:
                    condicao = false;
                    System.out.println("Volte sempre!");
                default:

                    System.out.println("operação invalida");
                    break;
            }

        }
    }

    public static void menuFuncionario() {
        Scanner read = new Scanner(System.in);

        System.out.println("Menu Funcionário");
        System.out.println("6-Cadastro Funcionario\n7-Cadastro Usuario\n8-Cadastrar Livro\n9-Emprestar Livro");
        int opcao = read.nextInt();
        read.nextLine();

        switch (opcao) {
            case 6:
                System.out.println("Cadastro Funcionario");
                System.out.println("Qual o nome ?");
                String nome = read.nextLine();
                System.out.println("Qual o id ?");
                int id = read.nextInt();
                read.nextLine();

                Funcionario funcionario = new Funcionario(nome, id);
                System.out.println("Cadastro realizado");
                System.out.println("Nome:" + funcionario.getNome() + "ID:" + funcionario.getId());

                break;

            case 7:
                System.out.println("Cadastro Usuario");
                System.out.println("Qual o nome ?");
                String nome1 = read.nextLine();
                System.out.println("Qual o id ?");
                int id1 = read.nextInt();
                read.nextLine();
                Usuario usuario = new Usuario(nome1, id1);
                System.out.println("Cadastro realizado");
                System.out.println("Nome:" + usuario.getNome() + "ID:" + usuario.getIdUsuario() + "Lista de livros:"
                        + usuario.getListaLivros());

                break;
            case 8:
                System.out.println("Cadastrar livro");
                System.out.println("Qual o titulo ?");
                String titulo = read.nextLine();

                System.out.println("Qual o Autor ?");
                String autor = read.nextLine();

                System.out.println("Qual o ano de publição ?");
                int ano = read.nextInt();
                read.nextLine();

                Livro novoLivro = new Livro(titulo, autor, ano);

                System.out.println("Qual o status do livro\n0-Disponivel\n1-Emprestado\n2-Reservado\n4-Exemplar");
                int status = read.nextInt();
                read.nextLine();
                novoLivro.setEstado(status);

                novoLivro.cadastrarLivro(novoLivro);
                break;

            default:
                System.out.println("operação invalida");

                break;
        }

    }

    public static void menuUsuario() {
        System.out.println("Menu Usuário");
        System.out.println("3-Emprestar\n4-Cadastrar\n5-Estado Livro");

    }

}
