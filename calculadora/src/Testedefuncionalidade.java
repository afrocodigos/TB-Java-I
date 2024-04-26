import calculadora.Calculadora;
import java.util.Scanner;

public class Testedefuncionalidade {
	
	public static double numero1;
	public static double numero2;
		
	public static void main(String[] args) {
				
		Scanner numeros = new Scanner(System.in);
		System.out.println("Calculadora: ");
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = numeros.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = numeros.nextDouble();
		
		
		Calculadora calculadora1 = new Calculadora(numero1, numero2);
		
		double somatoria = calculadora1.somar();
		double subtracao = calculadora1.subtrair();
		double multiplicacao = calculadora1.multiplicar();
		double divisao = calculadora1.dividir();
		
		System.out.printf("%.2f%n", somatoria);
		System.out.printf("%.2f%n", subtracao);
		System.out.printf("%.2f%n", multiplicacao);
		System.out.printf("%.2f%n", divisao);
		
		numeros.close();
	}


}