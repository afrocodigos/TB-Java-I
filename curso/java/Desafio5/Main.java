package Desafio5;
/**
 *  Minimundo - Biblioteca
 * Desafio aula 11/04/2024
 * */
public class Main {
    public static void main(String[] args) {

        //region ...Criando um funcionário
        Funcionario funcionario = new Funcionario();
        //endregion

        //region ...Criando livros
        System.out.println("================================================================================ Criando livros  ================================================================================");
        Livro livro1 = new Livro("Sistema Orientados a Objetos", "Pablo Rangel e José Gomes de Carvalho Jr",
                2021 );

        Livro livro2 = new Livro("Pensando em Sistemas", "Donella H. Meadows", 2008);


        Livro livro3 = new Livro("Lógica de Programação e Estruturas de Dados", "Sandra Puga e Gerson" +
                "Rissetti", 2016);

        Livro livro4 = new Livro("Jornada Java", "Criando por 32 pessoas", 2021);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println(livro4);
        //endregion

        //region ...Adicionando livros ao acervo
        System.out.println("================================================================================ Adicionando livros ao acervo  ================================================================================");
        funcionario.adicionarLivro(livro1);
        funcionario.adicionarLivro(livro2);
        funcionario.adicionarLivro(livro3);
        funcionario.adicionarLivro(livro4);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        System.out.println(livro4);
        //endregion

        //region ...Criando usuários
        System.out.println("================================================================================ Criando usuários  ================================================================================");
        Usuario usuario1 = new Usuario("João", 101);
        Usuario usuario2 = new Usuario("Marina", 102);
        Usuario usuario3 = new Usuario("José", 103);
        Usuario usuario4 = new Usuario("Ana", 104);

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
        //endregion

        //region ... Cadastrando o usuário
        System.out.println("================================================================================  Cadastrando o usuário  ================================================================================");
        funcionario.cadastrarUsuario(usuario1);
        funcionario.cadastrarUsuario(usuario2);
        funcionario.cadastrarUsuario(usuario3);
        funcionario.cadastrarUsuario(usuario4);
        //endregion

        //region Emprestando um livro para o usuário
        System.out.println("================================================================================ Emprestando um livro para o usuário  ================================================================================");
        usuario1.emprestarLivro(livro1);
        usuario2.emprestarLivro(livro4);
        usuario3.emprestarLivro(livro2);
        usuario4.emprestarLivro(livro3);

        System.out.println("================================================================================================================================================================");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
        //endregion

        //region Emprestando um livro para o usuário
        System.out.println("================================================================================ Tentando emprestar o mesmo livro novamente ================================================================================");
        usuario1.emprestarLivro(livro1);
        usuario2.emprestarLivro(livro4);
        usuario3.emprestarLivro(livro2);
        usuario4.emprestarLivro(livro3);
        //endregion

        //region Devolvendo o livro emprestado
        System.out.println("================================================================================ Devolvendo o livro emprestado ================================================================================");
        usuario1.devolverLivro(livro1);
        usuario2.devolverLivro(livro4);
        usuario3.devolverLivro(livro2);
        usuario4.devolverLivro(livro3);
        //endregion

    }
}
