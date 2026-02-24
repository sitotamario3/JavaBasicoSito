package ejercicios;

import java.util.ArrayList;

public class FirstArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> alumnos = new ArrayList<>();
		alumnos.add("Sito");
		alumnos.add("Pablo");
		alumnos.add("María");
		alumnos.add("James");
		alumnos.add("Paula");
		alumnos.add("Maddalena");
	
		for (int i = 0; i < alumnos.size(); i++) {
			
			System.out.println(alumnos.get(i));
			
		}
		
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}

	}

}
