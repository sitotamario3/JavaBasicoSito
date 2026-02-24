package ejercicios;

import java.util.Scanner;

public class Superheroe {
	
		Scanner sc = new Scanner(System.in);
	
		boolean capa;
		String nombre, superpoder;
		
		public Superheroe(String nombre, String superpoder) {
	        this.nombre = nombre;
	        this.superpoder = superpoder;
	        this.capa = true;
	    }
		
	public void describir() {
		String tieneCapa = (capa) ? "lleva" : "no lleva";
		System.out.println("Soy " + nombre + ", mi poder es " + superpoder + " y " + tieneCapa + "");
	}
	
	

}
