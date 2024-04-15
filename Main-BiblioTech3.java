import java.util.ArrayList;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String estado;

    public Livro(String titulo, String autor, int anoPublicacao, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estado = estado;
    }
}

class Usuario {
    String nome;
    int id;
    ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (livro.estado.equals("disponível")) {
            this.livrosEmprestados.add(livro);
            livro.estado = "emprestado";
        } else {
            System.out.println("O livro " + livro.titulo + " não está disponível para empréstimo.");
        }
    }
}

class Biblioteca {
    ArrayList<Livro> acervo;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario1 = new Usuario("Cristina", 1);
        var livro1 = new Livro("A Paciente Silenciosa", "Alex Michaelides", 2019, "disponível");
        Livro livro2 = new Livro("O Morro dos Vento Uivantes ", "Emily Bronter", 1987, "disponível");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        Usuario usuario = usuario1;
        biblioteca.registrarUsuario(usuario1);

        usuario.emprestarLivro(livro1); // Assuming you want the user to borrow the first book

        // Imprimir informações do livro emprestado
        System.out.println("Livro emprestado: " + livro1.titulo);
        System.out.println("Emprestado para: " + usuario.nome);
    }
}
