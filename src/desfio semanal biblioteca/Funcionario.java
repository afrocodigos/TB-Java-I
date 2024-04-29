public class Funcionario {

    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void cadastrarUsuario(String nome, int numeroIdentificacao) {
        // Implementar lógica de cadastro de usuário (ex: salvar em banco de dados)
        System.out.println("Usuário " + nome + " cadastrado com sucesso (ID: " + numeroIdentificacao + ")");
    }

    public void consultarUsuario(int numeroIdentificacao) {
        // Implementar lógica de consulta de usuário (ex: buscar no banco de dados)
        System.out.println("Consultando informações do usuário com ID: " + numeroIdentificacao);
        // Exibir informações do usuário aqui
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livro.estaDisponivel()) {
            livro.alterarEstado("Emprestado");
            // Implementar lógica para registrar o empréstimo (ex: salvar em banco de dados)
            System.out.println("Livro " + livro.getTitulo() + " emprestado para o usuário " + usuario.getNome());
            usuario.pegarLivroEmprestado(livro);
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.alterarEstado("Disponível");
        // Implementar lógica para registrar a devolução (ex: atualizar no banco de dados)
        System.out.println("Livro " + livro.getTitulo() + " devolvido.");
    }
}
