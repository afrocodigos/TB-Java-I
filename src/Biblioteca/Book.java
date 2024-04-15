package Biblioteca;

public class Book {

    public String title;
    public String author;
    public int yearPublished;
    public int stock;


    public Book(String title, String author, int yearPublished, int stock) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.stock = stock;

    }

    public void addBookStock (int quantity){
            stock += quantity;
    }

    public void removeBookStock (int quantity){
        if(stock > 0){
            stock -= quantity;
        }else {
            System.out.println("Quantidade indisponivel");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getStock() {
        return stock;
    }

}
