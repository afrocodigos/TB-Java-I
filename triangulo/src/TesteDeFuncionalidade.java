import java.util.Scanner;
import triangulo.Triangulo;

public class TesteDeFuncionalidade {
	public static double l1;
	public static double l2;
	public static double l3;
	
	public static void main(String[] args) {
		
		Scanner lados = new Scanner(System.in);
		
		System.out.println("Vamos Descobrir o tipo do triangulo?");
		System.out.println();
		System.out.println("Digite os lados do triângulo: ");
		System.out.println("Lado 1");
		
		l1 = lados.nextDouble();
		
		System.out.println("Lado 2");
		
		l2 = lados.nextDouble();
		
		System.out.println("Lado 3");
		
		l3 = lados.nextDouble();
		
		lados.close();
		
		Triangulo LadosInseridos = new Triangulo(l1, l2, l3);
		
		System.out.printf("O tipo do triangulo é: %s\n", LadosInseridos.tipoTriangulo());
	}

}
