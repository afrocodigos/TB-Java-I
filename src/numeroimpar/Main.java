package numeroimpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número");
        int valor = read.nextInt();
        read.nextLine();

        int contador = 0, numero = 0;
        while (contador < valor) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                contador++;
            }

            numero++;

        }

        read.close();
    }
}
