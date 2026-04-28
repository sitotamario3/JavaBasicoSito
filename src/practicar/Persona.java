package practicar;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", edad: " + edad;
	}
	
	
	public String toStringM() {
		
		if (edad >=18) {
		return "Nombre: " + nombre + ", edad: " + edad;
		} else {
			return "No hay personas mayores de edad";
		}
	}
	
	
	
	public static void main(String [] args) {
	ArrayList<Persona> personas = new ArrayList<>();

	Persona jaime = new Persona("Jaime", 31);
	Persona pedro = new Persona("Pedro", 11);
	Persona pablo = new Persona("pablo", 51);
	
	
	personas.add(jaime);
	personas.add(pedro);
	personas.add(pablo);
	
	for (Persona persona : personas)  {
		System.out.println(persona.toString());
	}
	
	System.out.println();
	
	for (Persona persona : personas)  {
		System.out.println(persona.toStringM());
	}
	
	
	
}
}
