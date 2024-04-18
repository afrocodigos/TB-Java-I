package utilitarios;

public class OperacoesMatematicas {
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for(double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
}
