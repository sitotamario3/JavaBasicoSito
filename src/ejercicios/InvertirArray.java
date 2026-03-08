package ejercicios;

import java.util.Scanner;

import java.util.Arrays;

public class InvertirArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] elementos = new String[5];
		
		System.out.println("Hola, dame 5 caracteres o palabras: ");
		
		for (int i = 0; i< elementos.length; i++) {
			elementos[i] = sc.nextLine();
		}
		
		String a = elementos[0];
		String b = elementos[1];
		String c = elementos[2];
		String d = elementos[3];
		String e = elementos[4];
		
		elementos[0] = e;
		elementos[1] = d;
		elementos[2] = c;
		elementos[3] = b;
		elementos[4] = a;
		
		System.out.println(Arrays.toString(elementos));
		
		
		
		
		sc.close();

	}

}
