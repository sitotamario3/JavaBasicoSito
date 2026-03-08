package ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class InvertirArraysV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] elementos = new String[5];
        // 1. Creamos el SEGUNDO array para la copia
        String[] invertido = new String[5];
        
        System.out.println("Hola, dame 5 caracteres o palabras: ");
        
        // Llenado del primer array
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = sc.nextLine();
        }
        
        // 2. Lógica para invertir usando un bucle
        // Recorremos 'elementos' de principio a fin, 
        // pero llenamos 'invertido' de fin a principio.
        for (int i = 0; i < elementos.length; i++) {
            invertido[i] = elementos[elementos.length - 1 - i];
        }
        
        // 3. Mostrar el resultado
        System.out.println("Array original: " + Arrays.toString(elementos));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
        
        sc.close();
    }
}