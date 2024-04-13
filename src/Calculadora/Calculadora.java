package Calculadora;

public class Calculadora {
    private double numberX;
    private double numberY;

    public Calculadora(double numberX, double numberY) {
        this.numberX = numberX;
        this.numberY = numberY;
    }

    public double getNumberX() {
        return numberX;
    }

    public void setNumberX(double numberX) {
        this.numberX = numberX;
    }

    public double getNumberY() {
        return numberY;
    }

    public void setNumberY(double numberY) {
        this.numberY = numberY;
    }

    public double somarValor() {
        return numberX + numberY;
    }

    public double subtrairValor() {
        return numberX - numberY;
    }

    public double dividirValor() {
        double result;
        result = numberX / numberY;

        if (result != 0) {
            return result;
        } else {
            System.out.println("divisão por zero");
            return result;
        }

    }

    public double multiplicarValor() {
        return numberX * numberY;
    }

}
