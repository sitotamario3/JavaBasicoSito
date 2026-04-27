package practicar;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	ArrayList<Persona> persona1 = new ArrayList<>();

	persona1.add("Jaime", 31);
}
