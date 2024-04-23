package vo;

import java.util.Scanner;

import entity.Funcionario;
import entity.Livro;
import entity.Usuario;

public class Menu {
    Funcionario funcionario = new Funcionario();
    Scanner read = new Scanner(System.in);

    public void menuFuncionario() {
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

                funcionario = new Funcionario(nome, id);
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

    Livro livro = new Livro();

    public void menuLivro() {

        System.out.println("----------------------");

        System.out.println("Menu Livros");
        System.out.println("1-Cadastro livro\n2-Emprestar Livro\n3-Devolver Livro");
        System.out.println("----------------------");

        int opcao = read.nextInt();
        read.nextLine();

        int codigo = 0;
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
                emprestarLivro();

                break;
            case 3:
                System.out.println("---Operação Devolver livro---");
                livro.listarLivros();
                System.out.println("Qual o codigo do livro ?");
                codigo = read.nextInt();
                read.nextLine();
                livro.devolverLivro(codigo);

                break;

            default:
                System.out.println("operação invalida");

                break;
        }

    }

    public void emprestarLivro() {
        int codigo;

        livro.listarLivros();
        System.out.println("Qual o codigo do livro ?");
        codigo = read.nextInt();
        read.nextLine();
        livro.emprestarLivro(codigo);

    }

    public void menuUsuario() {
        System.out.println("Menu Usuário");
        System.out.println("1-Emprestar\n2-Lista de livros emprestados");
        int opcao = read.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Emprestar livro");
                emprestarLivro();
                break;
            case 2:
                System.out.println("Lista de livro emprestados");
                break;

            default:
                System.out.println("opção invalida");
                break;
        }

    }

}
