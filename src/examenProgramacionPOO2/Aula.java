package examenProgramacionPOO2;

import java.util.ArrayList;

public class Aula {
	
	private String nombre;
	private int limite;
	private ArrayList<Alumno> alumnos;
	
	
	public Aula(String nombre, int limite, ArrayList<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.limite = limite;
		this.alumnos = alumnos;
	}
	
	public void añadirAlumno(Alumno alumno) { // Para controlar el aforo del aula
		if(alumnos.size() < limite) {
			alumnos.add(alumno);
			System.out.println("El alumno: " + alumno.getNombre() + " ha sido añadido con éxito");
		} else {
			System.out.println("El aula está llena, no se pueden añadir más alumnos");
		}
	}
	
	
	
	

}
