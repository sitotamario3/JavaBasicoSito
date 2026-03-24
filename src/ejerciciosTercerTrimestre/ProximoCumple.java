package ejerciciosTercerTrimestre;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ProximoCumple {

	public static void main(String[] args) {
		// Establezco el idioma 
		Locale idioma = Locale.forLanguageTag("es");
		
		// Fecha de hoy
		LocalDate hoy = LocalDate.now();
		
		// Fecha de nacimiento
		LocalDate miFecha = LocalDate.of(2003, 1, 7);
		
		System.out.println("Tu próximo cumpleaños: \t\t\t" + miFecha);
		
		// Cumpleaños en el año indicado (2026)
		LocalDate cumple = miFecha.withYear(2026);
		
		System.out.println("Tu cumple este año: \t\t\t" + cumple);
				
		// Verificamos si ha pasado el cumple 
		boolean esAntes = cumple.isBefore(hoy);
		boolean esDespues = cumple.isAfter(hoy);
		
		System.out.println("Ya ha pasado tu cumple este año?: \t" + esAntes);
		
		// Vemos los días que faltan:
		long diasParaCumple = ChronoUnit.DAYS.between(hoy, cumple);
		
		
		// Devolvemos los dias que faltan, dependiendo de si sera este año o el siguiente
		if (esDespues) {
			System.out.println("Días que faltan:\t\t\t" + diasParaCumple);
		} else if (esAntes) {
			LocalDate cumpleSiguiente = cumple.plusYears(1);
			long diasParaCumpleSiguiente = ChronoUnit.DAYS.between(hoy, cumpleSiguiente);
			System.out.println("Días que faltan:\t\t\t" + diasParaCumpleSiguiente);
			
		}
		
		
		// Saco el nombre del dia
		String nombreDia = cumple.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase();
		
		if (esDespues) {
			System.out.println("Caerá en:\t\t\t\t" + nombreDia);
		} else if (esAntes) {
			LocalDate cumpleSiguiente = cumple.plusYears(1);
			String nombreDiaSiguiente = cumpleSiguiente.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase();
			System.out.println("Caerá en:\t\t\t\t" + nombreDiaSiguiente);
		}
		
		
		
		// Saco el tipo de día
		switch (nombreDia){
			case "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES":
				System.out.println("Tipo de día:\t\t\t\t" + "Día de semana");
			break;
			case "SÁBADO", "DOMINGO":
				System.out.println("Tipo de día:\t\t\t\t" + "Fin de semana");
			break;
			default: 
				System.out.println("Error, intentalo otra vez");
		}
		
		
		
		

	}


}
