package Desafio6;

public class SistemaGestaoFuncionario {

    public static void main(String[] args) {

        // Criando instâncias de diferentes tipos de funcionários
        FuncionarioRegular regular = new FuncionarioRegular("Lucas", 21, 1800, 600);
        FuncionarioRegular regular2 = new FuncionarioRegular("João", 19, 1800, 600);


        Gerente gerente = new Gerente("Maria", 45, 10000, 5000);
        Diretor diretor = new Diretor("Marcos", 65, 25000, 12500);

        // Demonstrando o polimorfismo chamando o método calcularSalario para cada funcionário
        System.out.println("\nDetalhes do funcionário regular:");
        System.out.println("- Nome: " + regular.getNome() + ", Idade: " + regular.getIdade() + ", Salário: " + regular.getSalario());
        System.out.println("- Nome: " + regular2.getNome() + ", Idade: " + regular2.getIdade() + ", Salário: " + regular2.getSalario());
        System.out.println();

        // Férias Solicitadas
        regular2.solicitarFerias();

        System.out.println("\nDetalhes do gerente:");
        System.out.println("Nome: " + gerente.getNome() + ", Idade: " + gerente.getIdade() + ", Salário: " + gerente.getSalario() + ", Participação nos Lucros: " + gerente.getBonus());
        gerente.atribuirTarefas();

        System.out.println("\nDetalhes do diretor:");
        System.out.println("Nome: " + diretor.getNome() + ", Idade: " + diretor.getIdade() + ", Salário: " + diretor.getSalario() + ", Participação nos Lucros: " + diretor.getParticipacaoLucros());
        diretor.realizarReunioesDiretoria();
    }
}
