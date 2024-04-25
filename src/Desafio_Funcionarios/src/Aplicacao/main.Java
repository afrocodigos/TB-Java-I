//rodar a aplicação

package Aplicacao;

import Tipos_Funcionarios.FuncionariosRegular;
import Tipos_Funcionarios.Gerentes;
import Tipos_Funcionarios.Diretores;

public class main {
    public static void main(String[] args) {

        Funcionarios_Regular atendentes = new Funcionarios_Regular("Glória Maria", 60, 4500.00);
        Gerentes gerentes = new Gerente("Lazaro Ramaos", 48, 6500.00);
        Diretores Diretores = new Diretor("Maria Carolina de Jesus",50 , 10500.00);

      
        System.out.println(" Quadro de colaboradores: ");
 
        System.out.printf("Atendente %s, de %d anos: R$ %.2f\n", atendentes.getNome(), atendentes.getIdade(), atendentes.calcularSalario());
        System.out.printf("Gerente %s, de %d anos: R$ %.2f\n", gerentess.getNome(), gerentes.getIdade(), gerentes.calcularSalario());
        System.out.printf("Diretor %s, de %d anos: R$ %.2f\n", diretores.getNome(), diretores.getIdade(), diretores.calcularSalario());

    }
}
