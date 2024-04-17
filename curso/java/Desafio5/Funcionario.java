package Desafio5;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private List<Livro> acervoLivros;
    private List<Usuario> usuariosCadastrados;

    //region ...Construtor
    public Funcionario() {
        this.acervoLivros = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }
    //endregion

    //region ...Métodos para gerenciar o acervo de livros
    public void adicionarLivro(Livro livro) {
        acervoLivros.add(livro);
        System.out.println("Livro adicionado ao acervo: " + livro.getTitulo());
    }

    public void removerLivro(Livro livro) {
        acervoLivros.remove(livro);
        System.out.println("Livro removido do acervo: " + livro.getTitulo());
    }

    // Métodos para cadastro de usuários
    public void cadastrarUsuario(Usuario usuario) {
        usuariosCadastrados.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void removerUsuario(Usuario usuario) {
        usuariosCadastrados.remove(usuario);
        System.out.println("Usuário removido: " + usuario.getNome());
    }

    // Métodos para empréstimo e devolução de livros
    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (acervoLivros.contains(livro) && livro.getEstado().equals("Disponível")) {
            livro.setEstado("Emprestado");
            usuario.emprestarLivro(livro);
            System.out.println("Livro emprestado para " + usuario.getNome());
        } else {
            System.out.println("Não foi possível realizar o empréstimo do livro.");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (acervoLivros.contains(livro) && livro.getEstado().equals("Emprestado")) {
            livro.setEstado("Disponível");
            usuario.devolverLivro(livro);
            System.out.println("Livro devolvido por " + usuario.getNome());
        } else {
            System.out.println("Não foi possível realizar a devolução do livro.");
        }
    }
    //endregion

    //region ...Getters e Setters

    public List<Livro> getAcervoLivros() {
        return acervoLivros;
    }

    public void setAcervoLivros(List<Livro> acervoLivros) {
        this.acervoLivros = acervoLivros;
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(List<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    //endregion

    //region ...ToString
    @Override
    public String toString() {
        return "Funcionario{" +
                "acervoLivros=" + acervoLivros +
                ", usuariosCadastrados=" + usuariosCadastrados +
                '}';
    }
    //endregion
}
