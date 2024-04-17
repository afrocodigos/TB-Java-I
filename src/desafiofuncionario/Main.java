package desafiofuncionario;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Entre com o nome do funcionario");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        System.out.println("Entre com o cargo de "+ n+ ":");
        String c = input.nextLine();
        System.out.println("Entre com o salario de " + n + ":");
        double s = input.nextDouble();
        Funcionario f = new Funcionario(n, c, s);
        System.out.println(f);
    }
    
}
