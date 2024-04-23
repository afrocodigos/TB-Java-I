package entity;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String estado;
    private List<Livro> listaLivros = new ArrayList<>();

    public Livro(int idLivro, String titulo, String autor, int anoPublicacao) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    public Livro() {

    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
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

    public void cadastrarLivro(Livro livro) {
        listaLivros.add(livro);
        System.out.println("livro adicionado a lista");
    }

    public void listarLivros() {
        if (!listaLivros.isEmpty()) {
            for (int i = 0; i < listaLivros.size(); i++) {
                System.out.println(listaLivros.toString());
            }

        } else {
            System.out.println("Lista de livros vazia ");
        }

    }

    public void emprestarLivro(int idLivro) {

        for (int i = 0; i < listaLivros.size(); i++) {
            Livro livro = listaLivros.get(i);
            if (livro.getIdLivro() == idLivro) {
                if (livro.getEstado().trim().equals("disponivel")) {
                    livro.setEstado(1);
                    System.out.println(livro.toString());
                } else {
                    System.out.println("Não foi possivel realizar operação livro não disponivel");
                }

            }

        }

    }

    public void devolverLivro(int idLivroEmprestado) {

        for (int i = 0; i < listaLivros.size(); i++) {
            Livro livro = listaLivros.get(i);

            if (livro.getIdLivro() == idLivroEmprestado) {
                if (livro.getEstado().trim().equals("emprestado")) {
                    livro.setEstado(1);
                    System.out.println(livro.toString());
                }

            }
        }

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

    @Override
    public String toString() {
        return "Livro [idLivro:" + idLivro + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao="
                + anoPublicacao + ", estado="
                + estado + "]";
    }

}
