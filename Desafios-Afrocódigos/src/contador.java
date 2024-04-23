import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		
		Scanner inteiro = new Scanner(System.in);
		System.out.println("Digite o número: ");
		
		int x = inteiro.nextInt();
		int y = 0 , contador = 1;
		
		if(x <= 0){
			
			System.out.println("Não temos valores a serem apresentados! ");
			
		} else {
			System.out.printf("Os primeiros %d números ímpares são: ", x);
			System.out.println();
		}
		inteiro.close();
		
	//	while ( x > 0 && x != 1) {
	//		
	//		x = x - 2 ;
	//	
	//		System.out.println(x);
		
	//	}
		while ( y < x ) {
			
			System.out.println(contador);
			y ++;
			contador = contador + 2;
				
		}
	}	
}
	
