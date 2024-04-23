package biblioteca;

public class Usuarios extends Pessoa {
    protected int telefone;
    protected String livrosEmprestados;

    public Usuarios(String nome, int id, int telefone, String livrosEmprestados) {
        super(nome, id);
        this.telefone = telefone;
        this.livrosEmprestados = livrosEmprestados;
    }
    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getLivrosEmprestados(){
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(String livrosEmprestados){
        this.livrosEmprestados = livrosEmprestados;
    }

    public void listarLivrosEmprestados(){
        System.out.println("Esses livros estão sob minha responsabilidade");
    }
}