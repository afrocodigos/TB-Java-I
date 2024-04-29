public class DesafioSistemaGestaoGerente extends DesafioSistemaGestaoFuncionario {
    private double bonus; // Bônus para gerentes

    public DesafioSistemaGestaoGerente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus; // Inicializa o bônus
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Método para calcular salário para gerentes (salário base + bônus)
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus; // Adiciona o bônus ao salário
    }
}