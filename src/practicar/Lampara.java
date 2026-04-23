package practicar;

public class Lampara {
	private String color;
	private String marca;
	private boolean estaEncendida;
	
	public Lampara (String color, String marca) {
		this.color = color;
		this.marca = marca;
	}



public static void main(String[] args) {
	Lampara lampara1 = new Lampara("Rojo", "Philips");
	
	Lampara lampara2 = new Lampara("Blanco", "IKEA");
	
	System.out.println("Lampara 1: " + lampara1.color + ", " + lampara1.marca);
	System.out.println("Lampara 2: " + lampara2.color + ", " + lampara2.marca);
}

}
