package biblioteca;

public class Funcionario {
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Métodos de gerenciamento podem ser adicionados aqui
    public void cadastrarLivro(Biblioteca biblioteca, String titulo, String autor, int anoPublicacao, String estado) {
        Livro novoLivro = new Livro(titulo, autor, anoPublicacao, estado);
        biblioteca.addLivro(novoLivro);
        System.out.println("Livro cadastrado: " + titulo);
    }

    public void cadastrarUsuario(Biblioteca biblioteca, String nome, int id) {
        Usuario novoUsuario = new Usuario(nome, id);
        biblioteca.addUsuario(novoUsuario);
        System.out.println("Usuário cadastrado: " + nome);
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}

/*Os funcionários têm a responsabilidade de gerenciar o acervo de livros,
o cadastro de usuários e as operações de empréstimo e devolução de livros.*/