package ejercicios;

import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola dame una palabra para verificar si es palindroma "
                + "(se lee igual de izquierda a derecha como de derecha a izquierda)");
        
        // 1. Limpieza: Quitamos espacios y pasamos a mayúsculas para evitar fallos por 'A' vs 'a'
        String palabra = sc.nextLine().trim().toUpperCase();
        
        // 2. Herramienta de control: Asumimos que es verdad hasta que se demuestre lo contrario
        boolean esPalindromo = true;

        // 3. El Bucle: Solo recorremos hasta la mitad (palabra.length() / 2)
        for (int i = 0; i < palabra.length() / 2; i++) {
            
            // Calculamos la posición del "espejo" al final de la palabra
            char letraInicio = palabra.charAt(i);
            char letraFin = palabra.charAt(palabra.length() - 1 - i);

            // Si un solo par de letras no coincide, ya no es palíndromo
            if (letraInicio != letraFin) {
                esPalindromo = false;
                break; // Salimos del bucle inmediatamente para ahorrar tiempo
            }
        }

        // 4. Resultado final
        if (esPalindromo && !palabra.isEmpty()) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo.");
        }

        sc.close();
    }
}