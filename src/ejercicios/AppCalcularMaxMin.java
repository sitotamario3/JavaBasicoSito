package ejercicios;

import java.util.Scanner;

public class AppCalcularMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hola, ¿cuántas cifras quieres introducir?: ");
        int cantidad = sc.nextInt();
        
        int[] numeros = new int[cantidad];
        
        // El programa pide los números por teclado
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Llamamos a la función pasando el array y guardamos el resultado
        int[] resultados = calcularMaxMin(numeros);
        
        System.out.println("--------------------------------");
        System.out.println("El valor máximo es: " + resultados[0]);
        System.out.println("El valor mínimo es: " + resultados[1]);
    }
    
    /**
     * Función que recibe un arreglo y devuelve el máximo y el mínimo.
     * @return Un arreglo donde el índice 0 es el máximo y el 1 es el mínimo.
     */
    public static int[] calcularMaxMin(int[] arreglo) {
        // Inicializamos con el primer elemento del arreglo
        int max = arreglo[0];
        int min = arreglo[0];
        
        // Recorremos el arreglo para comparar cada valor
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }
        
        // Devolvemos ambos valores en un nuevo arreglo
        return new int[]{max, min};
    }
}