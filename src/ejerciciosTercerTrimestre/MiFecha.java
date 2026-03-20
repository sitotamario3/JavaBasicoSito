package ejerciciosTercerTrimestre;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MiFecha {

	public static void main(String[] args) {
		Locale idioma = Locale.forLanguageTag("es");
		
		LocalDate hoy = LocalDate.now();
		
		LocalDate miFecha = LocalDate.of(2003, 8, 7);
		
		int miDia = miFecha.getDayOfMonth();
		
		int miMes = miFecha.getMonthValue();
		
		String nombreDia = miFecha.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma).toUpperCase();
		
		String nombreMes = miFecha.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase();
		
				
		int miAño = miFecha.getYear();
		
		System.out.println("Hoy es : " + hoy);
		
		System.out.println("Naciste en: " + miFecha);
				
		System.out.println("Día :" + miDia);
		
		System.out.println("Mes :" + miMes);
		
		System.out.println("Año :" + miAño);
		
		System.out.println("Mes :" + nombreMes);
		
		System.out.println("Día :" + nombreDia);
		
		
		

	}

}
