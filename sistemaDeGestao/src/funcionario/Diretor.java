package funcionario;

public class Diretor extends Funcionario {
	
	private double participacaoLucros;
	
	public Diretor(String nome, int idade, double salario,String departamento, double participacaoLucros) {
        super(nome, idade, salario,"Diretor", departamento);
        
        this.participacaoLucros = participacaoLucros;
	}
	
	public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    // Sobrescrita do método calcularSalario()
    @Override
    public double calcularSalario() {
        // Salário do diretor é o salário base mais a participação nos lucros
        return getSalario() + participacaoLucros;
    }
    
}
