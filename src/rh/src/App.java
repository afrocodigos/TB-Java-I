public class App {
    public static void main(String[] args) {
        Funcionario diretor = new Diretor("Maria", 22, 0, "diretor", 130);
        ((Diretor) diretor).calcularSalario();
        System.out.println(
                "Funcionário Diretor\n" + diretor.toString() + "\n----------------------------------------------");
        Funcionario gerente = new Gerente("Sol", 22, 0, "Gerente", 140);
        ((Gerente) gerente).calcularSalario();
        System.out.println(
                "Funcionário Gerente\n" + gerente.toString() + "\n----------------------------------------------");

        Funcionario funcionarioRegular = new FuncionarioRegular("MariSol", 22, 0, "FuncionarioRegular", 200);
        ((FuncionarioRegular) funcionarioRegular).calcularSalario();
        System.out.println(
                "Funcionário Funcionario Regular\n" + funcionarioRegular.toString()
                        + "\n----------------------------------------------");

    }
}
