package ejercicios;

public class CuadradosCubos {

    public static void main(String[] args) {
        
        // Matriz con 3 filas: números (1-5), cuadrados y cubos
        int[][] potencias = {
            {1, 2, 3, 4, 5},       // Números
            {1, 4, 9, 16, 25},     // Cuadrados (n^2)
            {1, 8, 27, 64, 125}    // Cubos (n^3)
        };
        
        System.out.println("NÚM | CUAD | CUBO");
        System.out.println("-----------------");

        // Recorremos las columnas (j) para mostrar cada número con su potencia
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < potencias.length; i++) {
                // Accedemos a potencias[fila][columna]
                System.out.print(potencias[i][j] + "\t"); 
            }
            System.out.println(); // Salto de línea por cada número procesado
        }
        
        System.out.println();
        
        for (int c = 0; c < 3; c++) {
        	System.out.println(potencias[c][c]);
        }
    }
}