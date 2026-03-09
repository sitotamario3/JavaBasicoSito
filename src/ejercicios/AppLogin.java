package ejercicios;

import java.util.Scanner;

public class AppLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intentosRealizados = 0;
        int maxIntentos = 3;
        boolean esValido = false;

        // El bucle debe estar aquí para volver a pedir los datos
        while (intentosRealizados < maxIntentos && !esValido) {
            System.out.print("Introduce tu usuario: ");
            String usuarioDado = sc.nextLine().trim();

            System.out.print("Introduce tu contraseña: ");
            String contraseñaDada = sc.nextLine().trim();

            // Llamamos a la función Login
            esValido = login(usuarioDado, contraseñaDada);

            if (esValido) {
                System.out.println("Acceso concedido.");
            } else {
                intentosRealizados++;
                System.out.println("Acceso denegado. Intentos restantes: " + (maxIntentos - intentosRealizados));
            }
        }

        if (!esValido) {
            System.out.println("Has superado el límite de intentos.");
        }

        sc.close();
    }

    // La función ahora devuelve un booleano (true/false)
    public static boolean login(String usuario, String contraseña) {
        String usuarioCorrecto = "usuario1";
        String contraseñaCorrecta = "asdasd";

        return usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta);
    }
}