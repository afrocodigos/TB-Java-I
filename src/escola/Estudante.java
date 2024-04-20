package escola;

public class Estudante extends Pessoa{
    private int anoEscolar;

    public Estudante(String nome, String endereco, int anoEscolar) {
        super(nome, endereco);
        this.anoEscolar = anoEscolar;
    }

    public void matricular() {
        System.out.println("Matricula realizada com sucesso");
    }

    public void estudar() {
        System.out.println("Status: estudando....");
    }
}
