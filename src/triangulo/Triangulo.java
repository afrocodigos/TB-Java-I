package triangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("O tipo do triangulo é Equilátero");
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O tipo do triangulo é Isósceles");
            return "Isósceles";
        } else {
            System.out.println("O tipo do triangulo é Escaleno");
            return "Escaleno";
        }
    }
}
