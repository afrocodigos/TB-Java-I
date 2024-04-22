public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double somar() {
        return num1 + num2;
    }
    public double subtrair() {
        return num1 - num2;
    }
    public double multiplicar() {
        return num1 * num2;
    }
    public double dividir() {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return num1 / num2;
    }
    
}
