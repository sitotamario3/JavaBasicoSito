package ejercicios;

import java.util.Scanner;

public class PalabraLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		
		System.out.println("Hola, dame 2 palabras");
		palabra1 = sc.nextLine();
		palabra2 = sc.nextLine();
		
		if (palabra1.length() > 8) {
			System.out.println("La primera palabra tiene más de 8 caracteres");
		} else if (palabra1.length() < 8) {
			System.out.println("La primera palabra tiene tiene menos de 8 caracteres");
		} else {
			System.out.println("La primera palabra tiene 8 caracteres");
		}
		
		if (palabra2.length() > 8) {
			System.out.println("La primera palabra tiene más de 8 caracteres");
		} else if (palabra2.length() < 8) {
			System.out.println("La primera palabra tiene tiene menos de 8 caracteres");
		} else {
			System.out.println("La primera palabra tiene 8 caracteres");
		}
		
		sc.close();

	}

}
