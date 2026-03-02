package ejercicios;

import java.util.Scanner;

public class ContarCaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		
		char caracter;
		
		int contador = 0;
		
		System.out.println("Hola! Dame una frase o palabra: ");
		cadena = sc.nextLine();
		
		System.out.println("Dame un caracter para ver cuantas veces se ha repetido en la frase o palabra: ");
		caracter = sc.nextLine().charAt(0);
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
		}
		
		System.out.println("El total de veces que se repite el caracter es: " + contador);
		
		
		sc.close();

	}

}
