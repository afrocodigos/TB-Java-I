public class DesafioBibliotecaLivro {
    String titulo;
    String autor;
    int anoPublicacao;
    String estado;

    public DesafioBibliotecaLivro(String titulo, String autor, int anoPublicacao, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estado = estado;
    }

    public void alterarEstado(String novoEstado) {
        this.estado = novoEstado;
    }

    public String obterInformacoes() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + ", Estado: " + estado;
    }
}