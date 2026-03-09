package ejercicios;

public class SumaFilasyColumnas {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valor = (int) (Math.random() * 100);
				matriz[i][j] = valor;
				sum += matriz[i][j];
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("La suma de los valores de la matriz es de: " + sum);

	}

}
