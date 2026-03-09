package ejercicios;

public class SumarArray {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int[] numeros = {0, 1, 2, 3, 4, 5};
		
		for (int i = 0; i < numeros.length; i++) {
			
			contador += numeros[i];
			
		}
		
		System.out.println(contador);

	}

}
