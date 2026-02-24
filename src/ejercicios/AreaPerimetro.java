package ejercicios;

import java.util.Scanner;

public class AreaPerimetro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double radio;
		
		System.out.println("Hola! Dame el valor del radio del círculo para calcular su área y perimetro: ");
		radio = sc.nextDouble();
		
		System.out.println("El perimetro es: " + calcularPerimetroCirculo(radio) + ". El área es: " + calcularAreaCirculo(radio) );
		
		
		sc.close();
		

	}

	public static double calcularPerimetroCirculo(double radio) {
		System.out.println("Hola");
		double totalPerCirc = 2 * Math.PI * radio;
		return totalPerCirc;
	}
	
	public static double calcularAreaCirculo(double radio) {
		System.out.println("Hola");
		double totalAreCirc = Math.PI * Math.pow(radio, 2);
		return totalAreCirc;
	}
}
