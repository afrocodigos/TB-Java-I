package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private List<Livro> acervoLivros;
    private List<Usuario> cadastroUsuarios;

    // Construtor
    public Funcionario() {
        this.acervoLivros = new ArrayList<>();
        this.cadastroUsuarios = new ArrayList<>();
    }

    // Métodos para gerenciar o acervo de livros
    public void adicionarLivro(Livro livro) {
        acervoLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        acervoLivros.remove(livro);
    }
    
    public List<Livro> getAcervosLivros(){
    	return acervoLivros;
    }

    // Métodos para gerenciar o cadastro de usuários
    public void cadastrarUsuario(Usuario usuario) {
        cadastroUsuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        cadastroUsuarios.remove(usuario);
    }

    // Métodos para operações de empréstimo e devolução de livros
    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livro.getEstado().equals("disponível")) {
            livro.setEstado("emprestado");
            usuario.adicionarLivroEmprestado(livro);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            livro.setEstado("disponível");
            usuario.removerLivroEmprestado(livro);
        } else {
            System.out.println("Este livro não foi emprestado por este usuário.");
        }
    }
}
