package calculadora;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double somar() {
        double soma = this.numero1 + this.numero2;
        return soma;
    }

    public double subtrair() {
        double subtracao = this.numero1 - this.numero2;
        return subtracao;
    }

    public double multiplicar() {
        double multiplicacao = this.numero1 * this.numero2;
        return multiplicacao;
    }

    public double dividir() {
        double divisao = this.numero1 / this.numero2;
        return divisao;
    }
}
