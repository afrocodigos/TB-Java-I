package Desafio6;

/**
 * Subclasse Diretor
 * */
public class Diretor extends Funcionario{

    private double participacaoLucros;

    //region ...Sobrescrevendo o método calcularSalario para diretores
    @Override
    public double calcularSalario() {
        return getSalario() + participacaoLucros;
    }
    //endregion

    //region ...Método para realizar reuniões de diretoria (exemplo)
    public void realizarReunioesDiretoria() {
        System.out.println("Reuniões de diretoria realizadas pelo diretor: " + getNome());
    }
    //endregion

    //region ...Constructor
    public Diretor(String nome, int idade, double salario, double participacaoLucros) {
        super(nome, idade, salario);
        this.participacaoLucros = participacaoLucros;
    }
    //endregion

    //region ...Getter and Setter
    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
    //endregion
}
