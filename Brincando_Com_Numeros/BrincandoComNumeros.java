
/******************************************************************************
Crie uma função que receba uma matriz de números inteiros, 
some os números pares e ímpares separadamente e retorne a diferença 
entre a soma dos números pares e ímpares.
*******************************************************************************/
import java.util.Scanner;

public class BrincandoComNumeros

{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Guerra dos Numeros");
        System.out.print("Defina o tamanho do seu array: "); // user insere o tamanho do array

        int tamanhoArray = read.nextInt(); // lendo tamanho do array
        int[] array = new int[tamanhoArray]; // declarando o array com o tamanho definido pelo user

        int somaPar = 0, somaImpar = 0, diferenca = 0;

        // preenchendo as posicoes do array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor da posição " + i + ":");
            array[i] = read.nextInt();
        }

        // passa por todas a s posicoes do array e realiza a soma do numeros par ou
        // impar separadamente
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 == 0) {
                somaPar = somaPar + num; // soma num par
            } else {
                somaImpar = somaImpar + num; // soma num impar
            }
        }

        // imprimi os resultados
        System.out.println("Soma dos valores par é :" + somaPar);
        System.out.println("Soma dos valores impar é :" + somaImpar);

        // realiza a diferença entre as somas
        if (somaImpar < somaPar) { // caso a soma do numeros par for maior ele será o minuendo
            diferenca = somaPar - somaImpar;
            System.out.println("Diferença :" + somaPar + " - " + somaImpar + "=" + diferenca);
        } else { // caso a soma do numeros impar for maior ele será o minuendo
            diferenca = somaImpar - somaPar;
            System.out.println("Diferença: " + somaImpar + " - " + somaPar + " = " + diferenca);
        }
        read.close();

    }
}
