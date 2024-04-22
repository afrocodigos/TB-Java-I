public class CalculadoraSimples {
    // Atributos da classe
    private final double numero1;
    private final double numero2;

    // Método construtor
    public CalculadoraSimples(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {

        CalculadoraSimples calc = new CalculadoraSimples(8, 2);

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());

        // Testando a divisão por zero
        CalculadoraSimples calcZero = new CalculadoraSimples(5, 0);
        try {
            System.out.println("Divisão por zero: " + calcZero.dividir());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    // Método para somar os números
    public double somar() {
        return numero1 + numero2;
    }

    // Método para subtrair os números
    public double subtrair() {
        return numero1 - numero2;
    }

    // Método para multiplicar os números
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método para dividir o primeiro número pelo segundo
    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por 0 não é permitida");
        }
        return numero1 / numero2;
    }
}