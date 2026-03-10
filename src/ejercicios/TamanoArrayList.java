package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TamanoArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int entrada;

        System.out.println("Introduce números (escribe -1 para terminar):");

        // Bucle para pedir números
        while (true) {
            entrada = sc.nextInt();
            
            // Si el número es -1, salimos del bucle sin guardarlo
            if (entrada == -1) {
                break;
            }
            
            numeros.add(entrada);
        }

        // Verificamos si la lista tiene elementos para evitar errores
        if (numeros.size() > 0) {
            System.out.println("--- Resultados ---");
            System.out.println("Cantidad de elementos: " + numeros.size());
            System.out.println("Primer elemento: " + numeros.get(0));
            
            // El último elemento siempre está en la posición: tamaño - 1
            int ultimoIndice = numeros.size() - 1;
            System.out.println("Último elemento: " + numeros.get(ultimoIndice));
        } else {
            System.out.println("No se introdujeron números válidos.");
        }
        
        sc.close();

	}

}
