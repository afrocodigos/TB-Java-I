package entities;

public class AnoBissexto {
    private int anoDigitado;
    public AnoBissexto(int anoDigitado) {
        this.anoDigitado = anoDigitado;
    }

    public boolean eBissexto(int anoDigitado){
        if (anoDigitado % 4 == 0 && (anoDigitado % 100 != 0 || anoDigitado % 400 == 0)){
            System.out.println("O ano " + anoDigitado + " é bissexto");
            return true;
        }else {
            System.out.println("O Ano " + anoDigitado + " não é bissexto");
            return false;
        }
    }
}
