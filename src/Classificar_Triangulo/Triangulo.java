package Classificar_Triangulo;

public class Triangulo {

    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public String classificarTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";

        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "isósceles";
        } else if (lado1 != lado2 && lado2 != lado3) {
            return "escaleno";

        } else {
            return "nao é triangulo";
        }
    }

}
