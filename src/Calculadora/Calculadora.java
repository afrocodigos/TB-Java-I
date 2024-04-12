package Calculadora;

public class Calculadora {
    private Double numberX;
    private Double numberY;

    public Calculadora(Double numberX, Double numberY) {
        this.numberX = numberX;
        this.numberY = numberY;
    }

    public Double getNumberX() {
        return numberX;
    }

    public void setNumberX(Double numberX) {
        this.numberX = numberX;
    }

    public Double getNumberY() {
        return numberY;
    }

    public void setNumberY(Double numberY) {
        this.numberY = numberY;
    }

    public Double somarValor() {
        return numberX + numberY;
    }

    public Double subtrairValor() {
        return numberX - numberY;
    }

    public Double dividirValor() {
        Double result;
        result = numberX / numberY;

        if (result != 0) {
            return result;
        } else {
            System.out.println("divisão por zero");
            return result;
        }

    }

    public Double multiplicarValor() {
        return numberX * numberY;
    }

}
