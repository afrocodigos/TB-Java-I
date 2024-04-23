package funcionario;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		
		// Criando instâncias de diferentes tipos de funcionários
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular("João", 30, 3000);
        Gerente gerente = new Gerente("Maria", 35, 5000, 1000);
        Diretor diretor = new Diretor("Carlos", 45, 10000, 2000);

        // Chamando o método calcularSalario() para cada funcionário
        System.out.println("Salário do Funcionário Regular: " + (funcionarioRegular).calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Diretor: " + diretor.calcularSalario());

	}

}
