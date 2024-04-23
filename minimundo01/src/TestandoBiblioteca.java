import biblioteca.Usuario;
import biblioteca.Funcionario;
import biblioteca.Livro;
import java.util.List;

public class TestandoBiblioteca {
    public static void main(String[] args) {
    	
        // Criando alguns livros
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "disponível");
        Livro livro2 = new Livro("1984", "George Orwell", 1949, "disponível");
        Livro livro3 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "disponível");

        // Criando um funcionário
        Funcionario funcionario = new Funcionario();

        // Adicionando os livros ao acervo da biblioteca
        funcionario.adicionarLivro(livro1);
        funcionario.adicionarLivro(livro2);
        funcionario.adicionarLivro(livro3);

        // Criando um usuário
        Usuario usuario = new Usuario("João", 12345);

        // Exibindo o acervo da biblioteca antes do empréstimo
        System.out.println("Acervo da biblioteca antes do empréstimo:");
        exibirAcervo(funcionario);

        // Funcionário empresta um livro para o usuário
        funcionario.emprestarLivro(livro1, usuario);

        // Exibindo o acervo da biblioteca após o empréstimo
        System.out.println("\nAcervo da biblioteca após o empréstimo:");
        exibirAcervo(funcionario);

        // Funcionário tenta emprestar um livro já emprestado
        funcionario.emprestarLivro(livro1, usuario);

        // Usuário devolve o livro emprestado
        funcionario.devolverLivro(livro1, usuario);

        // Exibindo o acervo da biblioteca após a devolução
        System.out.println("\nAcervo da biblioteca após a devolução:");
        exibirAcervo(funcionario);
    }

    // Método auxiliar para exibir o acervo da biblioteca
    public static void exibirAcervo(Funcionario funcionario) {
        List <Livro> acervo = funcionario.getAcervosLivros();
        for (Livro livro : acervo) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano: "
                    + livro.getAnoPublicacao() + ", Estado: " + livro.getEstado());
        }
    }
}
