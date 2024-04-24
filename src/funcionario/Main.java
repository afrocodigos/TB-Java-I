package desafio02;

public class Main {
    public static void main(String[] args) {

        // O método abstrato "calcularSalario" da Classe Funcionario, é sobrescrito em suas Subclasses
        // Casa subclasse possui sua regra de negócio específica detalhada abaixo:

        // Salário do Funcionário Regular é igual ao salário base
        // Salário total do Gerente é resultado da soma entre o salário base e porcentagem das vendas
        // Salário total do Diretor recebe o acréscimo de um bônus caso a meta seja batida

        FuncionarioRegular funcReg = new FuncionarioRegular("Hugo", 15, 3000, "Suporte", "Analista");
        Gerente gerente = new Gerente("Gabriela", 28, 4000, "Suporte", 18000, 0.10);
        Diretor diretor = new Diretor("Tulio", 32, 7000, "Suporte", 1500, false);

        System.out.println("R$ " + funcReg.calculaSalario() + " (Salário Funcionário Regular = Salário Base)");
        // out: R$ 3000.0 (Salário Funcionário Regular = Salário Base)

        System.out.println("R$ " + gerente.calculaSalario() + " (Salário Gerente = " + gerente.salarioBase + " + (" + gerente.vendas + " * " + gerente.comissao + ")");
        // out: R$ 5800.0 (Salário Gerente = 4000.0 + (18000.0 * 0.1)

        System.out.println("R$ " + diretor.calculaSalario() + " (Salário Diretor = " + diretor.salarioBase + " + " + diretor.bonus + ")");
        // out: R$ 7000.0 (Salário Diretor = 7000.0 + 1500.0)
    }
}
