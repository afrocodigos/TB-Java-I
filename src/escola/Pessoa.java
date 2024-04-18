package escola;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void comer() {
        System.out.println("Estou comendo...");
    }

    public void dormir() {
        System.out.println("ZzzZzzZzzZzZ....");
    }
}
