package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public String title;
    public String author;
    public int yearPublished;
    public String status;
    public List<Integer> availableQuantity;

    public Book(String title, String author, int yearPublished, int availableQuantity, String status) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.availableQuantity = new ArrayList<>();
        this.status = status;
    }

    public void addBookStock (int quantity){
            availableQuantity.add(quantity);
    }

    public void removeBookStock (int quantity){
        availableQuantity.remove(quantity);
    }

    @Override
    public String toString(){
        return "Livro{" +
                "titulo='" + title + '\'' +
                ", autor='" + author + '\'' +
                ", anoPublicacao=" + yearPublished +
                ", estado=" + status +
                ", quantidadeDisponivel=" + availableQuantity +
                '}';
    }
}
