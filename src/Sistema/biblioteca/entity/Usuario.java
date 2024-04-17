package biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int idUsuario;
    private List<String> listaLivros;
    private List<Usuario> listaUsuarios;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.listaLivros = new ArrayList<>();

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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void cadastrarUsuario(Usuario novoUsuarios) {
        listaUsuarios.add(novoUsuarios);
    }

    public void emprestarLivros() {

    }

    @Override
    public String toString() {
        return "Usuario [nome=" + getNome() + ", idUsuario=" + getIdUsuario() + "]";
    }

}
