package classificaano;

public class Ano {

    private int ano;

    public Ano(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verificarAno(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " ano bissexto");

        } else {
            System.out.println(ano + " ano não é bissexto");
        }

    }

}
