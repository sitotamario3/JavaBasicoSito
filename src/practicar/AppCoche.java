package practicar;

public class AppCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Ford", "Focus", "V4", 125);
		Coche coche2 = new Coche("Porsche", "911", "V8", 560);
		
		System.out.println(coche1.getInfo());
		
		System.out.println();
		
		System.out.println(coche2.getInfo());
		
		
	}

}
