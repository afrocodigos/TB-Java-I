package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Users {

    public int id;
    public List<Book> quantityBookLent;
    public String nome;


    public Users(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.quantityBookLent = new ArrayList<>();
    }

    public void lendBook (Book book) {
        quantityBookLent.add(book);
        book.removeBookStock(1);
        System.out.println("Emprestado");
    }

    public void giveBackBook (Book book){
        quantityBookLent.remove(book);
        book.addBookStock(1);
        System.out.println("Devolvido");
    }

    public int getId() {
        return id;
    }

    public List<Book> getQuantityBookLent() {
        return quantityBookLent;
    }

    public String getNome() {
        return nome;
    }

}
