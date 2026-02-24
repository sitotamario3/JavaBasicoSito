package ejercicios;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		int contador = 1;
		
		
		System.out.println("Hola, dame una frase: ");
		frase = sc.nextLine().trim();
		
		int i = 0;
		
		
		for (i = 0; i < frase.length() ; i++) {
			
			
			if ((frase.charAt(i) == (' ')) && (frase.charAt(i+1) != ' ') ) {
				contador++;
			}
		}
		
		System.out.println("El total de palabras en la frase es de: " + contador);
		
		
		sc.close();

	}

}
