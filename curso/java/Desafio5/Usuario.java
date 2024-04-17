package Desafio5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int numeroIdentificacao;
    private List<Livro> livrosEmprestados;

    //region ...Construtor
    public Usuario(String nome, int numeroIdentificacao) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.livrosEmprestados = new ArrayList<>();
    }
    //endregion

    //region ...Métodos para emprestar e devolver livros
    public void emprestarLivro(Livro livro) {
        if (livro.getEstado().equals("Disponível")) {
            livro.setEstado("Emprestado");
            livrosEmprestados.add(livro);
            System.out.println("Livro emprestado com sucesso para " + nome);
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.setEstado("Disponível");
            livrosEmprestados.remove(livro);
            System.out.println("Livro devolvido com sucesso por " + nome);
        } else {
            System.out.println("Você não possui este livro emprestado.");
        }
    }
    //endregion

    //region ...Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    //endregion

    //region ...ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", numeroIdentificacao=" + numeroIdentificacao +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
    //endregion
}
