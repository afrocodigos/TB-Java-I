import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

// Classe para calcular a soma dos números primos dentro de um intervalo
public class DesafioSomaNumerosPrimos {

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // Se for divisível por algum número além de 1 e ele mesmo
                return false; // Não é primo
            }
        }
        return true; // Se não houver divisores, é primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para entrada do usuário

        // Solicita ao usuário para inserir o intervalo
        System.out.print("Digite o número inicial: ");
        int inicio = scanner.nextInt(); // Número inicial do intervalo
        System.out.print("Digite o número final: ");
        int fim = scanner.nextInt(); // Número final do intervalo

        int somaPrimos = 0; // Para armazenar a soma dos números primos

        // Loop para percorrer o intervalo
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) { // Verifica se o número é primo
                somaPrimos += i; // Se for primo, adiciona à soma
            }
        }

        // Exibe a soma dos números primos dentro do intervalo
        System.out.println("A soma dos números primos de " + inicio + " a " + fim + " é: " + somaPrimos);

        scanner.close(); // Fecha o Scanner
    }
}
