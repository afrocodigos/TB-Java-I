public class DesafioBibliotecaFuncionario {
    String nome;
    int identificacao;

    public DesafioBibliotecaFuncionario(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public DesafioBibliotecaLivro cadastrarLivro(String titulo, String autor, int anoPublicacao) {
        return new DesafioBibliotecaLivro(titulo, autor, anoPublicacao, "disponível");
    }

    public DesafioBibliotecaLeitor cadastrarLeitor(String nome, int identificacao) {
        return new DesafioBibliotecaLeitor(nome, identificacao);
    }

    public void emprestarLivro(DesafioBibliotecaLivro livro, DesafioBibliotecaLeitor leitor) {
        if (livro.estado.equals("disponível")) {
            livro.alterarEstado("emprestado");
            leitor.emprestarLivro(livro);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(DesafioBibliotecaLivro livro, DesafioBibliotecaLeitor leitor) {
        livro.alterarEstado("disponível");
        leitor.devolverLivro(livro);
    }
}