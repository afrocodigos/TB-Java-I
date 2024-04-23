public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double salario, String cargo, int horasTrabalhadas) {
        super(nome, idade, salario, cargo, horasTrabalhadas);
        // TODO Auto-generated constructor stub

    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double salario = getHorasTrabalhadas() * 50;
        if (getHorasTrabalhadas() > 120) {
            double bonus = (getHorasTrabalhadas() - 120) * 25.75;
            salario += bonus;
        }
        setSalario(salario);
    }

}
