package ejercicios;

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Definimos los arrays con los datos de los meses
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = teclado.nextInt();

        // Validamos que el número esté en el rango correcto
        if (mes >= 1 && mes <= 12) {
            // Restamos 1 al índice porque el array va de 0 a 11
            String nombre = nombresMeses[mes - 1];
            int dias = diasMeses[mes - 1];

            System.out.println("El mes " + mes + " es " + nombre + " y tiene " + dias + " días.");
        } else {
            System.out.println("Error: El número debe estar entre 1 y 12.");
        }

        teclado.close();
    }
}