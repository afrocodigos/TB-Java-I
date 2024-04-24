package desafio02;

public class Diretor extends Funcionario{
    public double bonus;
    public boolean metaBatida;

    public Diretor(String nome, int idade, double salarioBase, String departamento, double bonus, boolean metaBatida) {
        super(nome, idade, salarioBase, departamento);
        this.bonus = bonus;
        this.metaBatida = metaBatida;
    }

    @Override
    public double calculaSalario() {
        if (metaBatida == true) {
            Double salarioTotal = this.salarioBase + bonus;
            return salarioTotal;
        } else {
            return this.salarioBase;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }
}
