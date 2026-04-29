package practicar;

import java.util.ArrayList;

public class Ciclo {
	private String nombre;
	private int maxPlazas;
	private ArrayList<Alumno> alumnos;
	private int generMatriculas = 0;
	
	public Ciclo(String nombre, int maxPlazas) {
		this.nombre = nombre;
		this.maxPlazas = maxPlazas;
		this.alumnos = new ArrayList<>();
		this.generMatriculas =1;
		
	}
	
	public void matricularAlumno(Alumno alumno) {
		if(alumnos.size() < maxPlazas) {
			alumno.matricular(generMatriculas);
			alumnos.add(alumno);
			generMatriculas ++;
			System.out.println(alumno.getAlumno() + " ha sido matriculado con éxito.");
		} else {
			System.out.println("El ciclo está completo, no se pueden añadir más matrículas.");
		}
	}
	
	public void mostrarAlumnos() {
		System.out.println("Lista de alumnos en el ciclo " + this.nombre + ":");
		for (Alumno alumno : alumnos) {
			 alumno.mostrarDatos();
		}
	}
	
	public void mostrarPlazasDisponibles() {
		int libres = maxPlazas - alumnos.size();
		System.out.println("Plazas libres en " + nombre + ": " + libres);
	}
	
	public static void main(String[] args) {
		Ciclo miCiclo = new Ciclo ("DAM", 2);
		
		Alumno a1 = new Alumno("Juan Pérez", "12345678A");
	    Alumno a2 = new Alumno("María López", "87654321B");
	    Alumno a3 = new Alumno("Carlos Ruiz", "11223344C");
	    
	    miCiclo.mostrarPlazasDisponibles();
	    
	    System.out.println("\n--- Iniciando matriculación ---");
	    miCiclo.matricularAlumno(a1);
	    miCiclo.matricularAlumno(a2);
	    miCiclo.matricularAlumno(a3);
	    
	    System.out.println("\n--- Estado Final ---");
	    miCiclo.mostrarAlumnos();
	    miCiclo.mostrarPlazasDisponibles();
		
		
	}
	
	

}
