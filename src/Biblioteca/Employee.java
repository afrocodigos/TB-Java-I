package Biblioteca;


import java.util.ArrayList;
import java.util.List;


public class Employee {
    public List<Book> collection;
    public List<Users> users;

    public Employee() {
        this.collection = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void listAllBooks (){
        System.out.println("Lista de Livros:");
        for (Book book : collection) {
            System.out.println("Título do livro: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Ano de publicação: " + book.getYearPublished());
            System.out.println("Estoque: " + book.getStock());
            System.out.println("-----------------");
        }
    }

    public void listAllUsers (){
        System.out.println("Lista de Usuarios:");
        for (Users users : users) {
            System.out.println("Nome do usuário: " + users.getNome());
            System.out.println("ID do usuário: " + users.getId());
            System.out.println("livos emprestados:");
            for (Book book : users.getQuantityBookLent()) {
                System.out.println("- " + book.getTitle());
            }
            System.out.println("-----------------");
        }
    }

    public Users searchUser(String nome) {
        for (Users user : users) {
            if (user.getNome().equalsIgnoreCase(nome)) {
                return user;
            }
        }
        return null;
    }

    public Book searchBooks(String nome) {
        for (Book book : collection) {
            if (book.getTitle().equalsIgnoreCase(nome)) {
                return book;
            }
        }
        return null;
    }

    public void lendBook(Users user, Book book){
        if (book.getStock() > 0 ){
            user.lendBook(book);
        }else {
            System.out.println("Este livo não está disponivel");
        }
        System.out.println("Estado do livro " + book.getStock());
    }

    public void giveBackBook (Users user, Book book){
        user.giveBackBook(book);
    }

    public void addStockBooks (Book book, int quantity){
        if(collection.contains(book)){
            book.addBookStock(quantity);
            System.out.println(quantity + "quantidade adcionada ao estoque");
        }else {
            System.out.println("livro não encontrado");
        }
    }

    public void createBook(String title, String author, int yearPublished, int stock){
        Book book = new Book(title ,author ,yearPublished ,stock );
        collection.add(book);
    }

    public void createUsers (String nome, int id){
        Users user = new Users(nome, id);
        users.add(user);
    }


}
