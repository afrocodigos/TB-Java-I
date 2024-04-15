package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String estado;
    private List<Livro> listaLivros;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.listaLivros = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public List<Livro> getListaLivro() {
        return listaLivros;
    }

    public void setListaLivro(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void setEstado(int estado) {
        if (estado == 0) {
            this.estado = "disponivel";
        } else if (estado == 1) {
            this.estado = "emprestado";
        } else if (estado == 2) {
            this.estado = "reservado";
        } else if (estado == 3) {
            this.estado = "exemplar";
        }
    }

    public void cadastrarLivro(Livro livro) {
        listaLivros.add(livro);

    }

}
