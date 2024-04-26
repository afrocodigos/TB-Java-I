package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        boolean out = false;

        while (!out) {
            System.out.println("\n--- Menu da Biblioteca ---");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Listar livros");
            System.out.println("4. Listar usuários");
            System.out.println("5. Emprestar livro");
            System.out.println("6. Devolver livro");
            System.out.println("7. Adicionar mais livros ao estoque");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.println("+++++++++++++++++++++");
                    cadBook(scanner,employee);
                    System.out.println("---------------------");
                    break;

                case 2:
                    System.out.println("+++++++++++++++++++++");
                    cadUser(scanner,employee);
                    System.out.println("---------------------");

                case 3:
                    System.out.println("+++++++++++++++++++++");
                    listAllBooks(employee);
                    System.out.println("---------------------");
                    break;

                case 4:
                    System.out.println("+++++++++++++++++++++");
                    listAllUsers(employee);
                    System.out.println("---------------------");
                    break;

                case 5:
                    System.out.println("+++++++++++++++++++++");
                    lendBooks(scanner,employee);

                    System.out.println("---------------------");
                    break;

                case 6:
                    System.out.println("+++++++++++++++++++++");
                    giveBackBooks(scanner,employee);
                    System.out.println("---------------------");
                    break;

                case 7:
                    System.out.println("+++++++++++++++++++++");
                    addStockBook(scanner,employee);
                    System.out.println("---------------------");
                    break;

                case 8:
                    out = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        }

        scanner.close();
    }

    public static void cadBook(Scanner scanner, Employee employee) {
        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String author = scanner.nextLine();
        System.out.print("Digite o ano de publicação do livro: ");
        int yearPublication = scanner.nextInt();
        System.out.print("Digite a quantidade em estoque do livro: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        employee.createBook(title,author,yearPublication,stock);
    }

    public static void cadUser(Scanner scanner, Employee employee) {
        System.out.print("Digite o nome do usuário: ");
        String name = scanner.nextLine();
        System.out.print("Digite o número de identificação do usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        employee.createUsers(name,id);
    }

    public static void listAllBooks(Employee employee){
        employee.listAllBooks();
    }

    public static void listAllUsers(Employee employee){
        employee.listAllUsers();
    }

    public static void lendBooks(Scanner scanner, Employee employee) {
        System.out.print("Digite o nome do usuário: ");
        String nameUser = scanner.nextLine();
        System.out.print("Digite o título do livro: ");
        String titleBook = scanner.nextLine();

        Users user = employee.searchUser(nameUser);
        Book book = employee.searchBooks(titleBook);

        employee.lendBook(user,book);
    }

    public static void giveBackBooks(Scanner scanner, Employee employee) {
        System.out.print("Digite o nome do usuário: ");
        String nameUser = scanner.nextLine();
        System.out.print("Digite o título do livro: ");
        String titleBook = scanner.nextLine();

        Users user = employee.searchUser(nameUser);
        Book book = employee.searchBooks(titleBook);

        if (user != null && book != null) {
            employee.giveBackBook(user, book);
        } else {
            System.out.println("Usuário ou livro não encontrado.");
        }
    }
    public static void addStockBook(Scanner scanner, Employee employee) {

        System.out.print("Digite o título do livro: ");
        String titleBook = scanner.nextLine();
        System.out.print("Digite a quantidade a ser adicionada ao estoque: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        Book book = employee.searchBooks(titleBook);
        employee.addStockBooks(book,quantity);

        System.out.println("Estoque do livro '" + titleBook + "' atualizado para: " + book.getStock());

    }

}
