package biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private int id;
    private List<Funcionario> listaFuncionario = new ArrayList<>();

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;

    }

    public Funcionario() {

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

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public void adicionarFuncionario(Funcionario novoFuncionario) {
        listaFuncionario.add(novoFuncionario);

    }

    public void gerenciarArquivo() {

        // mudança de estado do livro

    }

    public void gerenciarOperacoes(int codigo) {

        // gerencia as operações de emprestimo e devolução

    }

    @Override
    public String toString() {
        return "Funcionario [nome= " + getNome() + ", id= " + getId() + "]";
    }

}
