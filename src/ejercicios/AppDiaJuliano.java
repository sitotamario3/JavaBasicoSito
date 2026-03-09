package ejercicios;

import java.util.Scanner;

public class AppDiaJuliano {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿En qué día del mes estás?: ");
        int dia = sc.nextInt();
        
        System.out.print("¿En qué mes estás? (1-12): ");
        int mes = sc.nextInt();
        
        System.out.print("¿En qué año estás?: ");
        int año = sc.nextInt();
        
        // Uso de los métodos
        System.out.println("\n" + leerFecha(dia, mes, año));
        
        if (esBisiesto(año)) {
            System.out.println("Nota: El año " + año + " es bisiesto.");
        }
        
        System.out.println("Días del mes actual: " + diasDelMes(mes, año));
        System.out.println("Día Juliano (día acumulado del año): " + calcularDiaJuliano(dia, mes, año));
            
        sc.close();
    }
    
    public static String leerFecha(int dia, int mes, int año) {
        return "Fecha introducida: " + dia + "/" + mes + "/" + año;
    }
    
    public static boolean esBisiesto(int año) {
        // Lógica simplificada en una sola línea
        return (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0);
    }
    
    public static int diasDelMes(int mes, int año) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // REUTILIZACIÓN: Llamamos a nuestra propia función esBisiesto
                return esBisiesto(año) ? 29 : 28;
            default:
                return 0; // Mes no válido
        }
    }
    
    public static int calcularDiaJuliano(int dia, int mes, int año) {
        int totalDias = dia; // Empezamos con los días del mes actual
        
        // Sumamos los días completos de los meses pasados
        for (int i = 1; i < mes; i++) {
            totalDias += diasDelMes(i, año);
        }
        return totalDias;
    }
}