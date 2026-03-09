package ejercicios;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		
		
		int[] valores = {8, 1, 2, 8, -5, 5};
		
		int max = valores[0];
		int min = valores[0];
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > max) {
				max = valores[i];
			}
			
			if (valores[i] < min) {
				min = valores[i];
			}
		}
		
		System.out.println("Maximo: " + max + " Mínimo: " + min);

	}

}
