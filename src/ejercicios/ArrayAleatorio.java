package ejercicios;

import java.util.Arrays;

public class ArrayAleatorio {

	public static void main(String[] args) {
		
		// 1. Cambiamos double[] por int[]
		int[] valores = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			
			// 2. Aplicamos la fórmula: (int)(Math.random() * RANGO + MINIMO)
			// El (int) sirve para quitar todos los decimales de golpe.
			valores[i] = (int)(Math.random() * 100 + 1);
			
		}
		
		System.out.println(Arrays.toString(valores));
	}

}