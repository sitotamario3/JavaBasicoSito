package ejercicios;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] temperaturas = new int[5][2];
		int min = temperaturas[0][0];
		int max = temperaturas[0][0];
		int minDias = min;
		int minSemana = temperaturas[0][0];
		
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				if (j < 1) {
					System.out.println("Temperatura mínima del día: " + (i+1));
					temperaturas[i][j] = sc.nextInt();
				} else {
					System.out.println("Temperatura máxima del día: " + (i+1));
					temperaturas[i][j] = sc.nextInt();
				}
				if (min >= temperaturas[i][j]) {
					min = temperaturas[i][j];
				} else {
					min = temperaturas[0][0];
				}
				if (max < temperaturas[i][j]) {
					max = temperaturas[i][j];
				}
			}
			System.out.println();
			if (minDias >= min) {
				minDias = min;
			} else {
				minDias = temperaturas[0][0];
			}
		}
		
		
		System.out.println("TEMPERATURAS DE LA SEMANA:");
		System.out.println("MIN MAX");
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[i].length; j++) {
				System.out.print(temperaturas[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("La temp más alta es: " + max + ", la temp más baja es " + min );
					
		
		sc.close();

	}

}
