package Biblioteca;

//import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int idUsuario;
    private List<String> listaLivros;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<String> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<String> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void emprestarLivros() {

    }

}
