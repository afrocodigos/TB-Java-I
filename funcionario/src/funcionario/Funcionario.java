package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		String funcionario, cargo;
		float salario;
		Scanner dadosFuncionario = new Scanner(System.in);
		
		System.out.println("Diga seu nome: ");
		funcionario = dadosFuncionario.nextLine();
		
		System.out.println("Diga seu cargo: ");
		cargo = dadosFuncionario.nextLine();
		
		System.out.println("Diga seu seu salário: ");
		salario = dadosFuncionario.nextFloat();
		
		Locale.setDefault(Locale.US);
				
		System.out.printf("%s, %s, e seu salário é: %.2f ", funcionario, cargo, salario);
		
		dadosFuncionario.close();
	}

}