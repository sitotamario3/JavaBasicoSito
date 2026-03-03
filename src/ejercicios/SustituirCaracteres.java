package ejercicios;

import java.util.Scanner;

public class SustituirCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase; 
		char oldChar, newChar;
		
		System.out.println("Hola, dame una frase");
		frase = sc.nextLine();
		
		System.out.println("Hola, dame un caracter que quieras sustituir");
		oldChar = sc.nextLine().charAt(0);
		
		System.out.println("Hola, dame el caracter por el cual lo quieres sustiuir");
		newChar = sc.nextLine().charAt(0);
		
		String nuevaFrase = frase.replace(oldChar, newChar);
		
		System.out.println("La frase actualizada sería: " + nuevaFrase);
		
		sc.close();

	}

}
