package triangulo;

public class TestaTriangulo {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2, 3, 4);
        System.out.println("lado 1 do triangulo: " + triangulo.getLado1());
        System.out.println("lado 2 do triangulo: " + triangulo.getLado2());
        System.out.println("lado 3 do triangulo: " + triangulo.getLado3());
        triangulo.tipoTriangulo();
    }
}
