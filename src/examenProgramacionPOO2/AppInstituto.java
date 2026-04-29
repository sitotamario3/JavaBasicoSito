package examenProgramacionPOO2;

import java.util.ArrayList;

public class AppInstituto {

	public static void main(String[] args) {
		
		// Alumnos
		
		Alumno sito = new Alumno("23f", "Sito", 8.5);
		
		Alumno Luis = new Alumno("23k", "Luis", 9.5);
		
		Alumno Carlos = new Alumno("25k", "Carlos", 3.5);
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		// Aulas
				
		Aula aula = new Aula("Informática", 2, alumnos); // Aula 1
		
		System.out.println("Aula 1:");
		
		aula.añadirAlumno(Luis);
		
		aula.añadirAlumno(sito);
		
		aula.añadirAlumno(Carlos);
		
		
		Alumno sito2 = new Alumno("23f", "Sito2", 8.5);
		
		Alumno Luis2 = new Alumno("23k", "Luis2", 10);
		
		Alumno Carlos2 = new Alumno("25k", "Carlos2", 3.5);
		
		ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>();
		
		
		Aula aula2 = new Aula("Economia", 5, alumnos2);
		
		// Anuncio segunda aula:
		
		System.out.println();
		
		System.out.println("Aula 2:");
		
		aula2.añadirAlumno(Luis2);
		
		aula2.añadirAlumno(sito2);
		
		aula2.añadirAlumno(Carlos2);
		
		
		// ArrayList de aulas:
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula);
		aulas.add(aula2);
		
		
		// Institutos
		
		//Instituto instituto = new Instituto("Galileo", aulas, personas);

	}

}
