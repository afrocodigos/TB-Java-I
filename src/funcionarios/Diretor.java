package funcionarios;

public class Diretor extends FuncionarioGeral {
    private double plr;
    private double bonificacaoAnual;

    public Diretor(String nome, int idade, double salario, double plr, double bonificacaoAnual) {
        super(nome, idade, salario);
        this.plr = plr;
        this.bonificacaoAnual = bonificacaoAnual;
    }

    public double getPlr() {
        return plr;
    }

    public void setPlr(double plr) {
        this.plr = plr;
    }

    public double getBonificacaoAnual() {
        return bonificacaoAnual;
    }

    public void setBonificacaoanual(double bonificacaoAnual) {
        this.bonificacaoAnual = bonificacaoAnual;
    }

    @Override
    public double calcularSalario() {

        return super.getSalario() + plr + bonificacaoAnual;
    }

}
