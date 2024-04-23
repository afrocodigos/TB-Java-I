package funcionarios;

public class Administrativo extends FuncionarioGeral {
    private String senioridade;
    private double bonus;
    private double comissao;
    private double decimoTerceiro;

    public Administrativo(String nome, int idade, double salario, String senioridade, double bonus,
            double comissao,
            double decimoTerceiro) {
        super(nome, idade, salario);
        this.senioridade = senioridade;
        this.bonus = bonus;
        this.comissao = comissao;
        this.decimoTerceiro = decimoTerceiro;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(double decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
    }

    @Override
    public double calcularSalario() {

        return super.getSalario() + bonus + comissao + decimoTerceiro;
    }
}
