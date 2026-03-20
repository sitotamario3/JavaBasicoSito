package ejerciciosTercerTrimestre;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MiEdad {

	public static void main(String[] args) {
		
		// Establezco fecha nacimiento
		LocalDate miFecha = LocalDate.of(2003, 7, 7);
		
		System.out.println("Fecha de nacimiento: " + miFecha);
		
		// Establezco fecha actual
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Fecha de hoy: " + hoy);
		
		// Formateo para que me salga mi edad
		
		Period edad = Period.between(miFecha, hoy);		
		
		System.out.println("Edada exacta: " + edad.getYears() + " años " + edad.getMonths() + " meses y " + edad.getDays() + " días");
		
		// Muestro días vividos
		
		long diasVividos = ChronoUnit.DAYS.between(miFecha, hoy);
		
		System.out.println("Total días vividos: " + diasVividos);
		
		// Muestro semanas vividas
		
		long semanasCompletas = ChronoUnit.WEEKS.between(miFecha, hoy);
		
		System.out.println("Semanas completas: " + semanasCompletas);
		
	}

}
