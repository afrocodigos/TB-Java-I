public class DesafioSistemaGestaoTestar {
    public static void main(String[] args) {
        // Cria funcionários de diferentes tipos
        DesafioSistemaGestaoFuncionarioRegular funcionarioRegular = new DesafioSistemaGestaoFuncionarioRegular("Pedro", 25, 3000);
        DesafioSistemaGestaoGerente gerente = new DesafioSistemaGestaoGerente("Maria", 35, 5000, 1000); // Bônus de 1000
        DesafioSistemaGestaoDiretor diretor = new DesafioSistemaGestaoDiretor("Carlos", 45, 10000, 2000); // Participação nos lucros de 2000

        // Usa polimorfismo para calcular salários
        System.out.println("Salário do Funcionário Regular: " + funcionarioRegular.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Diretor: " + diretor.calcularSalario());

        // Exibe informações de cada funcionário
        funcionarioRegular.exibirInformacoes();
        gerente.exibirInformacoes();
        diretor.exibirInformacoes();
    }
}