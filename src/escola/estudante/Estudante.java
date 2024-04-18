package escola.estudante;

import escola.pessoa.Pessoa;

public class Estudante extends Pessoa {

    int anoEscolar;

    public Estudante(String nome, String endereco, int anoEscolar) {
        super(nome, endereco);
        this.anoEscolar = anoEscolar;
    }

    public int getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(int anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public void matricular() {
        System.out.println("Aluno: " + getNome() + " está Matriculado");

    }

    public void estudar() {
        System.out.println("Aluno: " + getNome() + " está estudando");
    }

}
