public class DesafioSistemaGestaoDiretor extends DesafioSistemaGestaoFuncionario {
    private double participacaoNosLucros; // Participação nos lucros para diretores

    public DesafioSistemaGestaoDiretor(String nome, int idade, double salario, double participacaoNosLucros) {
        super(nome, idade, salario);
        this.participacaoNosLucros = participacaoNosLucros;
    }

    public double getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }

    public void setParticipacaoNosLucros(double participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }

    // Método para calcular salário para diretores (salário base + participação nos lucros)
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoNosLucros; // Adiciona a participação ao salário
    }
}