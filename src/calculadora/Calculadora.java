package calculadora;

public class Calculadora {
    private double numero1;
    private double numero2;
    
    // Construtor
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
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
    
    // Método para dividir os números, tratando a divisão por zero
    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
        }
    }
}
