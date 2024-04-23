package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Funcionario funcionario = new Funcionario("Julião", 1);

        System.out.println(funcionario);
        funcionario.cadastrarLivro(biblioteca, "Fahrenheit 451", "Ray Bradbury", 1920, "disponível");
        funcionario.cadastrarUsuario(biblioteca, "Hugo", 101);

        Usuario usuario = biblioteca.getUsuarios().get(0);
        Livro livro = biblioteca.getLivros().get(0);

        usuario.emprestarLivro(livro);
        usuario.devolverLivro(livro);
    }
}