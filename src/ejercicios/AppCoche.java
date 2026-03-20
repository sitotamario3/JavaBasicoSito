package ejercicios;

public class AppCoche {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Renault", "Clio", "V8", 510);
		
		Coche coche2 = new Coche("Peugeot", "208", "V6", 400);
		
		System.out.println("Primer coche: " + coche1.getInfo());
		
		System.out.println();
		
		System.out.println("Segundo coche: " + coche2.getInfo());
		
		

	}

}
