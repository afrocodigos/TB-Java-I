package application;

import entities.AnoBissexto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner solicitarAno = new Scanner(System.in);

        System.out.print("Insira o ano que deseja verificar se é bissexto: ");
        int anoSolicitado = solicitarAno.nextInt();
        AnoBissexto ano = new AnoBissexto(anoSolicitado);

        ano.eBissexto(anoSolicitado);
    }
}
