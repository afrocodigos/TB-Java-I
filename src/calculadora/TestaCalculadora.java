package calculadora;

import calculadora.Calculadora;

public class TestaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5, 2);
        System.out.println("Primeiro número: " + calculadora.getNumero1());
        System.out.println("Segundo número: " + calculadora.getNumero2());
        System.out.println(calculadora.somar());
        System.out.println(calculadora.subtrair());
        System.out.println(calculadora.multiplicar());
        System.out.println(calculadora.dividir());
    }
}
