package ejercicios;

import java.util.Scanner;

public class AppConvertirEspaciado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Hola, dame una cadena de texto");
		texto = sc.nextLine().trim();
		
		sc.nextLine();
		
		System.out.println("Hola, tu texto separado quedaría así: " + ConvertirEspaciado(texto));
		
		
		sc.close();
		
		
	}
	
	public static String ConvertirEspaciado(String texto) {
	    StringBuilder constructor = new StringBuilder();
	    
	    for (int i = 0; i < texto.length(); i++) {
	        constructor.append(texto.charAt(i)); // Añade la letra
	        constructor.append(" ");             // Añade el espacio
	    }
	    
	    return constructor.toString(); // Lo convertimos a String para devolverlo
	}

}
