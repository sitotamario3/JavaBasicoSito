package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class AnalizarNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] notas = new int[5];
        int suma = 0;
        
        System.out.println("Introduce tus cinco notas: ");
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
            suma += notas[i];
        }

        // Inicializamos max y min con el primer elemento ya real
        int max = notas[0];
        int min = notas[0];

        // Recorremos para comparar (podemos empezar desde el índice 1)
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        
        // Usamos double para la media para no perder decimales
        double media = (double) suma / notas.length;
        
        System.out.println("Tus notas son: " + Arrays.toString(notas));
        System.out.println("La media es: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        
        sc.close();
    }
}