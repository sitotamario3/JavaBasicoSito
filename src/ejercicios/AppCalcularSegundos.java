package ejercicios;

import java.util.Scanner;

public class AppCalcularSegundos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int segundos, segundos1, minutos, horas;
		
		System.out.println("Hola, quieres calcular a segundos (a), o a horas, minutos y segundos (b)?: ");
		String decision = sc.nextLine().trim().toLowerCase();
		
		if (decision.equals("a")) {
			System.out.println("Introduce la cantidad de segundos totales: ");
			segundos = sc.nextInt();
			System.out.println(calcularHoras(segundos));
		} else if (decision.equals("b")) {
			System.out.println("Selecciona la cantidad de horas:");
			horas = sc.nextInt();
			System.out.println("Selecciona la cantidad de minutos:");
			minutos = sc.nextInt();
			System.out.println("Selecciona la cantidad de segundos:");
			segundos1 = sc.nextInt();
			System.out.println("El total de segundos es de: " + calcularSegundos(horas, minutos, segundos1));
		} else {
			System.out.println("Por favor, selecciona una de las opciones otorgadas");
		}
		
		
			
		sc.close();

	}
	
	public static int calcularSegundos(int horas, int minutos, int segundos1) {
		int horasSegundos = horas * 3600;
		int minutosSegundos = minutos * 60;
		int totalSegundos = horasSegundos + minutosSegundos + segundos1;
		return totalSegundos;
		
	}
	
	public static String calcularHoras(int segundos) {
		int segundosHoras = segundos / 3600;
		int segundosMinutos = (segundos % 3600) / 60;
		int segundos2 = segundos % 60;
		return "El tiempo equivalente es: " + segundosHoras + " horas, " + segundosMinutos + " minutos y " + segundos2 + " segundos";
	}

}
