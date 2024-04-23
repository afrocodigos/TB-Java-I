package funcionarios;

public class Gerente extends FuncionarioGeral {
    private int qntEquipes;
    private double plr;
    private double decimoTerceiro;

    public Gerente(String nome, int idade, double salario, int qntEquipes, double plr,
            double decimoTerceiro) {
        super(nome, idade, salario);
        this.qntEquipes = qntEquipes;
        this.plr = plr;
        this.decimoTerceiro = decimoTerceiro;
    }

    public int getQntEquipes() {
        return qntEquipes;
    }

    public void setQntEquipes(int qntEquipes) {
        this.qntEquipes = qntEquipes;
    }

    public double getPlr() {
        return plr;
    }

    public void setPlr(double plr) {
        this.plr = plr;
    }

    public double getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(double decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
    }

    @Override
    public double calcularSalario() {

        return super.getSalario() + plr + decimoTerceiro;
    }

}
