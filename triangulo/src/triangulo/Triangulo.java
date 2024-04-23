package triangulo;

public class Triangulo {
	
	public double l1;
	public double l2;
	public double l3;
	
	public Triangulo (double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;	
	}
	
	public String tipoTriangulo() {
		if (l1 == l2 && l2 == l3) {
			
			return "Equilátero";
			
		} else if ((l1 == l2 )||( l1 == l3 )||( l2 == l3)) {
			
			return "Isósceles";
			
		} else {
			
			return "Escaleno";
		}
	}
}
