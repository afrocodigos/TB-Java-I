package escola;

public class Aluno {
    private String nome;
    private static int matricula = 2024102;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeDado() {
        System.out.println("Nome:" + getNome());
    }
}