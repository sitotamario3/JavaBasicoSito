package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDocs {
	
	public static void main(String[] args) {
		
		ArrayList<String> prueba = new ArrayList<>();
		ArrayList<String> prueba2 = new ArrayList<>(Arrays.asList("Jhon", "Jerry", "Mike"));
		
		
		//Get elements:
		System.out.println(prueba2.get(0));
		
		//Get ArrayList size
		System.out.println(prueba2.size());
		
		//Add a new value
		prueba2.add("Mitch");
		
		System.out.println(prueba2.get(3));
		
		//Change a value		
		prueba2.set(0, "Luke");
		
		System.out.println(prueba2.get(0));
		
		//Remove a value (either with position or with the value itself)
		prueba2.remove(0);
		prueba2.remove("Jerry");
		
		System.out.println(prueba2.get(0));
		System.out.println(prueba2.get(1));
		
		//Print ArrayList
		
		System.out.println(prueba2);
		
	
}
}
