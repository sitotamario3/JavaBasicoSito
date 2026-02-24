package ejercicios;

import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		char caracter;
		int contador = 0;
		
		System.out.println("Hola! Dame un frase o palabra: ");
		cadena = sc.nextLine();
		
		System.out.println("Ahora dame un caracter que quieras buscar en la frase o palabra");
		caracter = sc.nextLine().charAt(0);
		
		for (int i = 0; i < cadena.length(); i++) {
			if (caracter == cadena.charAt(i)) {
				contador++;
			}
		}
		
		System.out.println("El caracter introducido se repite " + contador + " veces en la frase o palabra dada");
		
		
		
		sc.close();

	}

}
