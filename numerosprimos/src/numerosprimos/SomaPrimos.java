package numerosprimos;

import java.util.Scanner;

public class SomaPrimos {
    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Método para calcular a soma dos números primos dentro de um intervalo
    public static int somaPrimosNoIntervalo(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                soma += i;
            }
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();
        
        int somaDosPrimos = somaPrimosNoIntervalo(inicio, fim);
        
        System.out.println("A soma dos números primos entre " + inicio + " e " + fim + " é: " + somaDosPrimos);
        
        scanner.close();
    }
}

