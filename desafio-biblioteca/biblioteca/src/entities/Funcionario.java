package entities;

public class Funcionario extends Pessoa {
    protected String cargo;

    public Funcionario(String nome, int id, String cargo) {
        super(nome, id);
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void cadastrarUsuario() {
        System.out.println("Usuário cadastrado");
    }

    public void catalogarLivros() {
        System.out.println("Livros catalogados");
    }

    public void Estado() {
        System.out.println("Livro em status: ");
    }
}
