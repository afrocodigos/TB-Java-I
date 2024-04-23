import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livros;

    public Usuario(){
        this.livros = new ArrayList<Livro>();
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
    public ArrayList<Livro> getLivros() {
        return livros;
    }
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    public void pegarEmprestado(Livro livro){
        this.livros.add(livro);
    }
    public void devolver(Livro livro){
        this.livros.remove(livro);
    }
}
