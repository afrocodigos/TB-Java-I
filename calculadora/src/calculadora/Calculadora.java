package calculadora;

public class Calculadora {
	//atributos
	private double num1;
	private double num2;
	private double resultado;
	
	//método construtor
	public Calculadora (double numero1, double numero2){
		
		this.num1 = numero1;
		this.num2 = numero2;
	}
	
	public double somar(){
		resultado = num1 + num2;
		return resultado;
	}
	
	public double subtrair(){
		
		resultado = num1 - num2;
		return resultado;
		
	}
	
	public double multiplicar(){
		resultado = num1 * num2;
		return resultado;
	}
	
	public double dividir() {
		if (num2 == 0) {
			System.out.println("Erro: Divisão por zero.");
			return Double.NaN;
		}
		else {
			resultado = num1/num2;
			return resultado;
		}
	}
	
	
}
