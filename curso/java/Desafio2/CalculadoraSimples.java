package Desafio2;

/**
 * Desafio 09/04/2024
 * Calculadora Simples
 * */
import java.text.DecimalFormat;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(5,10);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Resultado da soma: " + df.format(calculadora.somar()));
        System.out.println("Resultado da subtração: " + df.format(calculadora.subtrair()));
        System.out.println("Resultado da multiplicação: " + df.format(calculadora.multiplicar()));
        System.out.println("Resultado da divisão: " + df.format(calculadora.dividir()));
    }
}
