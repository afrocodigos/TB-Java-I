package Desafio4;

import java.util.Scanner;

/**
 * Desafio 11/04/2024
 * Programa que calcula a soma dos números primos dentro de um intervalo
 * */
public class SomaNumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números inteiros
        System.out.print("Digite um número inteiro inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite outro número inteiro final: ");
        int fim = scanner.nextInt();

        // Calcula a soma dos números primos dentro do intervalo
        CalculadoraPrimos calculadora = new CalculadoraPrimos();
        calculadora.exibirNumerosPrimosEObterSoma(inicio, fim);

        scanner.close();
    }
}
