package tercerTrimestreExcepciones;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		while (true) {
		try {
		System.out.println("Hola, dame un numero entero por favor: ");
		int entero = sc.nextInt();
		System.out.println("El numero entero es valido: ");
		} catch (InputMismatchException e) {
			System.out.println("Por favor, introduce un valor válido");
		}
		
		}
		
		
		
		sc.close();

	}

}
