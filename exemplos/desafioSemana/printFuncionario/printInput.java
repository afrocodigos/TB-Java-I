import java.util.Scanner;
public class printInput {

    public static void main(String[] args){
        Scanner inputTeclado = new Scanner(System.in);

        System.out.println("Por favor, insira o nome do funcionário:");
        String nomeFuncionario = inputTeclado.nextLine();

        System.out.println("Por favor, insira o cargo do funcionário:");
        String cargoFuncionario = inputTeclado.nextLine();

        System.out.println("Por favor, insira o salário do funcionário:");
        double salarioFuncionario = inputTeclado.nextDouble();

        inputTeclado.nextLine();

        System.out.println("\nDados do funcionário:");
        System.out.println("Nome - " + nomeFuncionario);
        System.out.println("Cargo - " + cargoFuncionario);
        System.out.println("Salário - R$ " + salarioFuncionario);

        inputTeclado.close();
    }
}
