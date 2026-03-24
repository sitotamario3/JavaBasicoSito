package ejerciciosTercerTrimestre;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PersonaFecha {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public  PersonaFecha(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public long getEdad() {
		LocalDate hoy = LocalDate.now();
		long edad = ChronoUnit.YEARS.between(fechaNacimiento, hoy);
		return edad;
	}
	
	public long  getDiasVividos() {
		LocalDate hoy = LocalDate.now();
		long diasVividos = ChronoUnit.DAYS.between(fechaNacimiento, hoy);
		return diasVividos;		
	}
	
	public void ProximoCumple() {
		LocalDate hoy = LocalDate.now();
		LocalDate cumple = fechaNacimiento.withYear(2026);
		
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
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Edad: " + getEdad() + "\n" + "Días vividos: " + getDiasVividos();
	}
	
	public boolean esMayor(PersonaFecha pf) {
		
		if (this.fechaNacimiento.isBefore(pf.fechaNacimiento)) {
			
		}
		 
	}

}
