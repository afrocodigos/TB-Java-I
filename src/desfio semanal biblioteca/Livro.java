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

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", estado='" + estado + '\'' +
                '}';
    }

    public boolean estaDisponivel() {
        return estado.equals("Disponível");
    }

    public void alterarEstado(String novoEstado) {
        this.estado = novoEstado;
    }

    public String getTitulo() {
        return titulo;
    }
}
