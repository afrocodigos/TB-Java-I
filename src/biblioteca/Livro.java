package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String estado;

    public Livro(String titulo, String autor, int anoPublicacao, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

/*Os livros tem um título, um autor, um ano de publicação
e um estado (disponível, emprestado, reservado, etc.).*/