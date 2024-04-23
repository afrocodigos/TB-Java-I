package biblioteca;

public class Main {
    public static void main(String[] args) {
        Livros livros = new Livros("A Biblioteca da Meia-Noite", "Matt Haig", 2021, "Reservado");
        System.out.println("Titulo: " + livros.getTitulo());
        System.out.println("Autor: " + livros.getAutor());
        System.out.println("Ano de Publicação: " + livros.getAnoDePublicacao());
        System.out.println("Estado: " + livros.getEstado());
    }
}
