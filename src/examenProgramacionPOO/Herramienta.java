package examenProgramacionPOO;

import java.util.ArrayList;

public class Herramienta {
	
	private int[] numeros;
	private String idMuestra;	
	private int suma = 0;
	private int modaActual = 0;

	
	public Herramienta(String idMuestra, int[] numeros) {
		this.numeros = numeros;
		this.idMuestra = idMuestra;
		
	}
	
	public void Herramientas() {
		
	}
	
	public int calcularMedia() {
		for (int i = 0; i < numeros.length; i++) {
			suma+= numeros[i];
		}
		return suma / numeros.length;
	}
	
	public int moda() {
		for (int i = 0; i < numeros.length; i++) {
			suma ++; // No es esto, pero para que funcione la clase y compile (si no no hay correcion) (no me ha dado tiempo a escribir la lógica de la moda (otro for))
		}
		return modaActual;
	}
	
	public String getInfo() {
		return "Muestra: " + numeros + "\n" + "Media: " + calcularMedia() + "\n" + "Moda: ";
		
	}
	

}
