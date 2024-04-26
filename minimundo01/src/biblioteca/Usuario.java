package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
    private String nomeDoUsuario;
    private int numeroIdentificacao;
    private List<Livro> livrosEmprestados;

    // Construtor
    public Usuario(String nome, int numeroIdentificacao) {
        this.nomeDoUsuario = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Métodos para operações de empréstimo e devolução de livros
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void setNome(String nome) {
        this.nomeDoUsuario = nome;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

}
