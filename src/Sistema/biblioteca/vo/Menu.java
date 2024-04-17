package biblioteca.vo;

import java.util.Scanner;

import biblioteca.entity.Funcionario;
import biblioteca.entity.Livro;
import biblioteca.entity.Usuario;

public class Menu {
    public void menuFuncionario() {
        Scanner read = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Menu Funcionário");
        System.out.println("1-Cadastro Funcionario\n2-Cadastro Usuario\n3-Menu Livros");
        System.out.println("----------------------");

        int opcao = read.nextInt();
        read.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Cadastro Funcionario");
                System.out.println("Qual o nome ?");
                String nome = read.nextLine();
                System.out.println("Qual o id ?");
                int id = read.nextInt();
                read.nextLine();

                Funcionario funcionario = new Funcionario(nome, id);
                funcionario.adicionarFuncionario(funcionario);
                System.out.println("Cadastro realizado");
                System.out.println(funcionario.toString());
                break;

            case 2:
                System.out.println("Cadastro Usuario");
                System.out.println("Qual o nome ?");
                String nome1 = read.nextLine();
                System.out.println("Qual o id ?");
                int id1 = read.nextInt();
                read.nextLine();
                Usuario usuario = new Usuario(nome1, id1);
                usuario.cadastrarUsuario(usuario);
                System.out.println("Cadastro realizado");
                System.out.println(usuario.toString());

                break;
            case 3:
                menuLivro();
                break;

            default:
                System.out.println("operação invalida");

                break;
        }

    }

    public void menuLivro() {
        Scanner read = new Scanner(System.in);
        System.out.println("----------------------");

        System.out.println("Menu Livros");
        System.out.println("1-Cadastro livro\n2-Emprestar Livro\n3-Devolver Livro");
        System.out.println("----------------------");

        int opcao = read.nextInt();
        read.nextLine();

        Livro livro = new Livro();

        switch (opcao) {
            case 1:

                System.out.println("Cadastrar livro");
                System.out.println("Qual o id do livro ?");
                int idLivro = read.nextInt();
                read.nextLine();

                System.out.println("Qual o titulo ?");
                String titulo = read.nextLine();

                System.out.println("Qual nome do autor ?");
                String autor = read.nextLine();

                System.out.println("Qual o ano de publição ?");
                int ano = read.nextInt();
                read.nextLine();

                livro = new Livro(idLivro, titulo, autor, ano);

                System.out.println("Qual o status do livro\n0-Disponivel\n1-Emprestado\n2-Reservado\n4-Exemplar");
                int status = read.nextInt();
                read.nextLine();
                livro.setEstado(status);

                livro.cadastrarLivro(livro);
                System.out.println(livro.toString());

                break;
            case 2:
                livro.listarLivros();
                System.out.println("Qual o codigo do livro ?");

                break;
            case 3:

                break;

            default:
                System.out.println("operação invalida");

                break;
        }

    }

    public void menuUsuario() {
        // System.out.println("Menu Usuário");
        // System.out.println("3-Emprestar\n4-Cadastrar\n5-Estado Livro");

    }

}
