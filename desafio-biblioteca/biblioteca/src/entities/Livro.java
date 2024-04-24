package entities;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoDePublicacao;
    protected String estado;

    public Livro(String titulo, String autor, int anoDePublicacao, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}