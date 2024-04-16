package classificaano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ano;

        System.out.println("digite o ano");
        ano = read.nextInt();

        Ano objetoAno = new Ano(ano);

        objetoAno.verificarAno(ano);

        read.close();

    }

}
