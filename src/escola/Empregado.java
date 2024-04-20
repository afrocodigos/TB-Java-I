package escola;

public class Empregado extends Pessoa {
    private String categoria;
    private String funcao;

    public Empregado(String nome, String endereco, String categoria, String funcao) {
        super(nome, endereco);
        this.categoria = categoria;
        this.funcao = funcao;
    }

    public void trabalhar() {
        System.out.println("Trabalhando!");
    }

    public void baterPonto() {
        System.out.println("Sextou, esqueça tudo!");
    }
    
}
