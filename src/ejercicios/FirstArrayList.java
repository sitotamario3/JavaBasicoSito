package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Pablo", "Sito", "Maria", "Juan Carlos", "Roberto"));
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));			
		}
		
		System.out.println();
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

	}

}
