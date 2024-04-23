package application;

import entities.Livro;

public class Program {
    public static void main(String[] args) {
        Livro livros = new Livro("A pedagogia do hip-hop: consciência, resistência e saberes em luta", "Cristiane Correia", 2019, "Disponivel");
        System.out.println("Titulo: " + livros.getTitulo());
        System.out.println("Autor: " + livros.getAutor());
        System.out.println("Ano de Publicação: " + livros.getAnoDePublicacao());
        System.out.println("Estado: " + livros.getEstado());
    }
}
