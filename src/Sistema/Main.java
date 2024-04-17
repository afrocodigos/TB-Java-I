
import java.util.Scanner;

import biblioteca.entity.Funcionario;
import biblioteca.entity.Livro;
import biblioteca.entity.Usuario;
import biblioteca.vo.Menu;

public class Main {

    public static void main(String[] args) {

        boolean condicao = true;
        Scanner read = new Scanner(System.in);
        Menu opcoesMenu = new Menu();

        while (condicao) {
            System.out.println("-------------------------------------------------");
            System.out.println("Seja bem-vido a biblioteca\nEscolha uma opção\n1-Usuário\n2-Funcionário\n3-Sair");
            System.out.println("-------------------------------------------------");

            int opcao = read.nextInt();
            read.nextLine();

            switch (opcao) {
                case 1:
                    opcoesMenu.menuUsuario();

                    break;
                case 2:
                    opcoesMenu.menuFuncionario();
                    break;

                case 3:
                    condicao = false;
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("operação invalida");
                    break;
            }

        }
    }

}
