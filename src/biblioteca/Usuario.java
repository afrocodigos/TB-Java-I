package biblioteca;
import java.util.List;
import java.util.ArrayList;

public class Usuario {    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;  // A lista que mantém os livros emprestados pelo usuário

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();  // Inicialização correta da lista
    }

    public void emprestarLivro(Livro livro) {
        if ("disponível".equals(livro.getEstado())) {  // Verifica se o estado do livro permite empréstimo
            livrosEmprestados.add(livro);
            livro.setEstado("emprestado");
            System.out.println(nome + " emprestou " + livro.getTitulo());
        } else {
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {  // Remove o livro da lista de emprestados se ele estiver na lista
            livro.setEstado("disponível");
            System.out.println(nome + " devolveu " + livro.getTitulo());
        }
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}

/*Os leitores representa os usuários que frequentam a biblioteca.
Eles têm a capacidade de emprestar livros e contém informações como nome,
número de identificação e lista de livros emprestados.*/
