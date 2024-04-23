public class FuncionarioRegular extends Funcionario {

    public FuncionarioRegular(String nome, int idade, double salario, String cargo, int horasTrabalhadas) {
        super(nome, idade, salario, cargo, horasTrabalhadas);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double salario = getHorasTrabalhadas() * 25;
        if (getHorasTrabalhadas() > 120) {
            double bonus = (getHorasTrabalhadas() - 120) * 12.5;
            salario += bonus;
        }
        setSalario(salario);
    }

}
