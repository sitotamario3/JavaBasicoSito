package ejercicios;

import java.util.Scanner;

public class PalabraVertical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Hola, dame una palabra y la pondré en vertical");
        palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

        sc.close();
    }
}
