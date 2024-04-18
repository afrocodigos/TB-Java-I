package funcionarios;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;

    public Funcionario(String nomeFuncionario, String cargoFuncionario, double salarioFuncionario){
            this.nome = nomeFuncionario;
            this.cargo = cargoFuncionario;
            this.salario = salarioFuncionario;
    }

    public void imprimeFuncionario(){
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Cargo do funcionário: " + cargo);
            System.out.println("Salário do funcionário: R$ " + salario);
    }
}
