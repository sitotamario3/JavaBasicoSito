package examenProgramacionPOO;

import java.util.Scanner;

public class AppCalculosEstadisticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la dimensions de los arrays");
		
		int dimension = sc.nextInt();
		int[] b = new int[dimension];
		
		Herramienta herramienta = new Herramienta("Prueba", b);
		
		System.out.println(herramienta.calcularMedia());
		
		sc.close();

	}

}
