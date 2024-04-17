package desafio2;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entre com o inicio dos números: ");
        int inicio = s.nextInt();
        System.out.print("Entre com o fim dos números: ");
        int fim = s.nextInt();
        ArrayList<Integer> primos = new ArrayList<>();
        primos.add(2);
        int aux = 0;
        //Gerando um ArrayList de primos
        //Propriedade matemática. Todo numero não primo, é divisivel por um primo anterior a ele.
        for(int i = 2; i < fim; i++){
            aux = 0;
            for(int p:primos){
                if(i%p == 0){
                    aux++;
                }
            }
            if(aux == 0){
                primos.add(i);
            }
        }
        int soma = 0;
        for(int p:primos){
            if(p>=inicio && p<=fim)
                soma += p;
        }
        System.out.println("A soma dos números primos entre "+ inicio+ " e "+ fim+ " é: "+ soma);

    }
}