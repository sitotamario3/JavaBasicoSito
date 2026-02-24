package ejercicios;

import java.util.Scanner;

public class ComprobarDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		char letra;
		
		System.out.println("Hola! Dame los dígtos de tu DNI: ");
		numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Hola! Dame la letra de tu DNI: ");
		letra = sc.nextLine().charAt(0);
		
		
		System.out.println("Validez de el DNI " + calcularDNI(numero, letra));
		
		
		sc.close();

	}
	
	public static boolean calcularDNI(int numero, char letra) {
	    String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    // 1. Calculamos la posición que debería tener la letra
	    int posicionCorrecta = numero % 23; 
	    
	    // 2. Obtenemos la letra que corresponde a ese número
	    char letraCorrecta = letrasDNI.charAt(posicionCorrecta);
	    
	    // 3. Comparamos la letra que nos dieron con la que debería ser
	    return letra == letraCorrecta; 
	}
}
