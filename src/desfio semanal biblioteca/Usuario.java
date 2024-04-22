import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int numeroIdentificacao;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int numeroIdentificacao) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void visualizarLivrosEmprestados() {
        if (!livrosEmprestados.isEmpty()) {
            System.out.println("Livros emprestados:");
            for (Livro livro : livrosEmprestados) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Você não possui livros emprestados no momento.");
        }
    }

    public String getNome() {
        return nome;
    }
}
