package empresa;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static int contaDiretores() {
        int cont = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Diretor) {
                cont++;
            }
        }
        return cont;
    }
    public static int contaGerentes() {
        int cont = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                cont++;
            }
        }
        return cont;
    }
    public static int contaFuncionariosRegulares() {
        int cont = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioRegular) {
                cont++;
            }
        }
        return cont;
    }
    public static void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
    public static void promoverFuncionario(){
        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();
        Funcionario funcionario = encontrarFuncionario(cpf);
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado");
            return;
        }
        if (funcionario instanceof Diretor) {
            System.out.println("Diretor não pode ser promovido");
            return;
        }
        if (funcionario instanceof Gerente) {
            funcionarios.remove(funcionario);
            funcionarios.add(new Diretor(funcionario.getNome(), funcionario.getCpf(), funcionario.getSalario(), funcionario.getIdade()));
        }
        if (funcionario instanceof FuncionarioRegular) {
            funcionarios.remove(funcionario);
            funcionarios.add(new Gerente(funcionario.getNome(), funcionario.getCpf(), funcionario.getSalario(), funcionario.getIdade()));
        }

    }

    public static void demitirFuncionario(){
        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();
        Funcionario funcionario = null;
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                funcionario = f;
                break;
            }
        }
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado");
            return;
        }
        funcionarios.remove(funcionario);
    }

    public static void bonificarFuncionario(){
        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();
        Funcionario funcionario = encontrarFuncionario(cpf);
        if (funcionario == null) {
            System.out.println("Funcionário não encontrado");
            return;
        }
        if (funcionario instanceof Diretor) {
            System.out.print("Valor da bonificação: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            ((Diretor) funcionario).setBonus(bonus);
        }
        if (funcionario instanceof Gerente) {
            System.out.print("Valor da bonificação: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            ((Gerente) funcionario).setBonus(bonus);
        }
        if (funcionario instanceof FuncionarioRegular) {
            System.out.print("Valor da bonificação: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            ((FuncionarioRegular) funcionario).setBonus(bonus);
        }
    }
    public static Funcionario encontrarFuncionario(String cpf){
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    public static Funcionario menu(){
        System.out.println("1 - Cadastrar Diretor");
        System.out.println("2 - Cadastrar Gerente");
        System.out.println("3 - Cadastrar Funcionário Regular");
        System.out.println("4 - Listar Funcionários");
        System.out.println("5 - Promover Funcionário");
        System.out.println("6 - Bonificar Funcionario");
        System.out.println("7 - Calcular Salários");
        System.out.println("8 - Demitir Funcionario");
        System.out.println("9 - Sair");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        Funcionario funcionario = null;
        if(opcao >= 1 && opcao <= 3){
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            if(encontrarFuncionario(cpf) != null){
                throw new IllegalArgumentException("Funcionário já cadastrado");
            }
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 1){
                funcionario = new Diretor(nome, cpf, salario, idade);
            } else if(opcao == 2){
                funcionario = new Gerente(nome, cpf, salario, idade);
            } else {
                funcionario = new FuncionarioRegular(nome, cpf, salario, idade);
            }
            funcionarios.add(funcionario);
        } else if(opcao == 4){
            listarFuncionarios();
            funcionario = new FuncionarioRegular("", "", 0, 0);
        } else if(opcao == 5){
            promoverFuncionario();
            funcionario = new FuncionarioRegular("", "", 0, 0);
        } else if(opcao == 6){
            bonificarFuncionario();
            funcionario = new FuncionarioRegular("", "", 0, 0);
            
        } else if(opcao == 7){
            double somaRegular = 0;
            double somaGerente = 0;
            double somaDiretor = 0;
            for (Funcionario f : funcionarios) {
                System.out.println(f.getNome() + " - " + f.calcularSalario());
                if (f instanceof FuncionarioRegular) {
                    somaRegular += f.calcularSalario();
                }
                if (f instanceof Gerente) {
                    somaGerente += f.calcularSalario();
                }
                if (f instanceof Diretor) {
                    somaDiretor += f.calcularSalario();
                }
            }
            System.out.println("Total Funcionários Regulares: " + somaRegular);
            System.out.println("Total Gerentes: " + somaGerente);
            System.out.println("Total Diretores: " + somaDiretor);

            funcionario = new FuncionarioRegular("", "", 0, 0);
        } else if (opcao == 8) {
            demitirFuncionario();
            funcionario = new FuncionarioRegular("", "", 0, 0);
        } else if (opcao == 9){
            return null;
        } else {
            System.out.println("Opção inválida");
        }
        
        return funcionario;
    }
    public static void main(String... args) {
        Funcionario funcionario = null;
        do {
            funcionario = menu();
        } while (funcionario != null);
        System.out.println("Diretores: " + contaDiretores());
        System.out.println("Gerentes: " + contaGerentes());
        System.out.println("Funcionários Regulares: " + contaFuncionariosRegulares());
    }
}
