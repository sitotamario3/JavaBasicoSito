package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EstaEnArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Pablo", "Sito", "Maria", "Juan Carlos", "Roberto"));
        
        System.out.println("Busca un nombre en la base de datos: ");
        String busqueda = sc.nextLine();
        
        // Usamos una bandera (flag) para saber si lo encontramos
        boolean encontrado = false;

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(busqueda)) { // ignoreCase ayuda si escriben "pablo" en vez de "Pablo"
                System.out.println("El nombre " + busqueda + " sí está. Posición: " + (i + 1));
                encontrado = true;
                break; // Si ya lo encontramos, no hace falta seguir buscando
            } 
        }

        // Si después de recorrer toda la lista, 'encontrado' sigue siendo false...
        if (!encontrado) {
            System.out.println("El nombre " + busqueda + " no se encuentra en la lista.");
        }
        
        sc.close();
    }
}