package ejercicios;

import java.util.Scanner;

public class MaximoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		
		System.out.println("Hola dame la cantidad de filas de la tabla: ");
		N = sc.nextInt();
		
		System.out.println("Ahora dame la cantidad de columnas de la tabla: ");
		M = sc.nextInt();
		
		int[][] valores = new int[N][M];
		
		// 1. Lectura de datos
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print("Introduce valor para [" + i + "][" + j + "]: ");
				valores[i][j] = sc.nextInt();
			}
		}

		// 2. Lógica para encontrar el máximo
		int maximo = valores[0][0];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (valores[i][j] > maximo) {
					maximo = valores[i][j];
				}
			}
		}

		// 3. Impresión de la matriz (opcional)
		System.out.println("\n--- Matriz completa ---");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(valores[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nEl valor máximo de la matriz es: " + maximo);
				
		sc.close();

	}

}