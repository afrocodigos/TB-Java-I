package Biblioteca;

public class Funcionario {
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void gerenciarArquivo() {

        // mudança de estado do livro

    }

    public void gerenciarOperacoes() {

        // gerencia as operações de emprestimo e devolução

    }

}
