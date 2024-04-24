package application;

import entities.FuncionarioRegular;
import entities.Gerente;
import entities.Diretor;

public class Program {
    public static void main(String[] args) {

        FuncionarioRegular dev = new FuncionarioRegular("Lucas", 27, 2824.0);
        Gerente gerente = new Gerente("Julião", 27, 5648.0);
        Diretor diretor = new Diretor("Jéss",27 , 8224.0);

        System.out.println();
        System.out.println(" - - - - - - - - DADOS DOS FUNCIONARIOS ATUAIS - - - - - - - -");
        System.out.println();

        System.out.printf("Salário do desenvolvedor %s, de %d anos: R$ %.2f\n", dev.getNome(), dev.getIdade(), dev.calcularSalario());
        System.out.printf("Salário do gerente %s, de %d anos: R$ %.2f\n", gerente.getNome(), gerente.getIdade(), gerente.calcularSalario());
        System.out.printf("Salário da diretora %s, de %d anos: R$ %.2f\n", diretor.getNome(), diretor.getIdade(), diretor.calcularSalario());

    }
}
