package Classificar_Triangulo;

public class App {
    public static void main(String[] args) {
        String tipo;
        Triangulo triangulo = new Triangulo(3.0, 3.0, 3.0);
        tipo = triangulo.classificarTriangulo();
        System.out.println("O tipo do triângulo é: " + tipo);
    }

}
