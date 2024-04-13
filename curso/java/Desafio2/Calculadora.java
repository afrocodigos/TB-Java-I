package Desafio2;

public class Calculadora {

     private double numero1;
     private double numero2;

     //#region... Constructor
    public Calculadora() {}

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //endregion

     //#region ...Métodos(Somar, Subtrair, Multiplicar e Dividir)
    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if(numero2 == 0) {
            System.out.println("Erro: divisão por zero");
            return Double.NaN;
        } else {
            return numero1 / numero2;
        }
    }
    //endregion

     //#region ... Getter and Setter
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    //endregion
}
