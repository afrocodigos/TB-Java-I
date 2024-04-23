public class Diretor extends Funcionario {

    public Diretor(String nome, int idade, double salario, String cargo, int horasTrabalhadas) {
        super(nome, idade, salario, cargo, horasTrabalhadas);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double salario = getHorasTrabalhadas() * 100;
        if (getHorasTrabalhadas() > 120) {
            double bonus = (getHorasTrabalhadas() - 120) * 150;
            salario += bonus;
        }
        setSalario(salario);
    }

}
