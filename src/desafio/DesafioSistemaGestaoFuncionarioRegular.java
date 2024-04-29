public class DesafioSistemaGestaoFuncionarioRegular extends DesafioSistemaGestaoFuncionario {

    public DesafioSistemaGestaoFuncionarioRegular(String nome, int idade, double salario) {
        super(nome, idade, salario); // Chama o construtor da classe base
    }

    // Método para calcular salário para funcionários regulares (sem mudanças)
    @Override
    public double calcularSalario() {
        return super.calcularSalario(); // Retorna o salário base
    }
}