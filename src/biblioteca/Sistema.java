public class Sistema {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 1);
        Usuario usuario = funcionario.cadastrarUsuario("Maria", 1);
        Livro livro = funcionario.cadastrarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        funcionario.emprestarLivro(usuario, livro);
        Usuario usuario2 = funcionario.cadastrarUsuario("José", 2);
        funcionario.emprestarLivro(usuario2, livro);
        Livro livro2 = funcionario.cadastrarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        funcionario.reservarLivro(livro2, usuario2);
        funcionario.emprestarLivro(usuario, livro2);
        funcionario.emprestarLivro(usuario2, livro2);

    }
}
