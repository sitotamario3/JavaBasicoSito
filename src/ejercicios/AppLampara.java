package ejercicios;

public class AppLampara {

	public static void main(String[] args) {
		
		Lampara lampara1 = new Lampara("Rojo", "Philips", true);
		
		Lampara lampara2 = new Lampara("Blanco", "IKEA", false);
		
		System.out.println("Color: " + lampara1.color + " marca: " + lampara1.marca);
		System.out.println("Color: " + lampara2.color + " marca: " + lampara2.marca);
	}

}
