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

    public void bookLentIncreaseQuantity (Book book) {
        quantityBookLent.add(book);
    }

    public void bookLentDecreaseQuantity (Book book){
        quantityBookLent.remove(book);
    }

    @Override
    public String toString(){
        return "Usuario { " +
                "Nome= '" + nome + '\'' +
                "Id='" + id + '\'' +
                "Quantidade de livros emprestados= " + quantityBookLent +
                '}';
    }

}
