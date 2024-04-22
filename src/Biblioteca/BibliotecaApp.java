// TESTAR A APLICAÇÃO

//Entendo  que devo criar uma classe de Funcionários, Livros e Usuarios/Leitores e uma classe de aplicação (main) para rodar o projeto
// eu testei mas deu alguns erros, acho que me perdi um pouco rsrs

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // catalogar livros ao acervo
        Livro livro1 = new Livro("Teatro do Oprimido", "Augusto Boal", 2005, "disponível");
        Livro livro2 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "disponível");
        funcionario.adicionarLivro(livro1);
        funcionario.adicionarLivro(livro2);

        // cadastrar um usuário
        Usuario usuario1 = new Usuario("João", 123);
        funcionario.cadastrarUsuario(usuario1);

        // efetuar um empréstimo
        funcionario.emprestarLivro(usuario1, livro1);

        // verificar os livros emprestados pelo usuário
        System.out.println("Livros emprestados por " + usuario1.getNome() + ":");
        for (Livro livro : usuario1.getLivrosEmprestados()) {
            System.out.println(livro.getTitulo());
        }

        // realizar uma devolução
        funcionario.devolverLivro(usuario1, livro1);

        // validar se o livro foi devolvido
        System.out.println("Estado do livro " + livro1.getTitulo() + ": " + livro1.getEstado());
    }
}