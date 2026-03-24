package ejerciciosTercerTrimestre;

import java.time.LocalDate;

public class AppPersonaFecha {

	public static void main(String[] args) {
		
		LocalDate miFecha = LocalDate.of(2003, 7, 7);
		
		PersonaFecha miPersona = new PersonaFecha("Sito", miFecha);
		
		System.out.println(miPersona.getEdad());
		
		System.out.println(miPersona.getDiasVividos());
		
		System.out.println(miPersona.toString());
		
		

	}

}
