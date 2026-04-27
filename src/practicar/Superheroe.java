package practicar;

public class Superheroe {
	private String nombre;
	private String superpoder;
	private boolean capa = true;
	
	public Superheroe(String nombre, String superpoder) {
		this.nombre = nombre;
		this.superpoder = superpoder;
	}
	
	public void describir() {
		
		if (capa) {
			System.out.println("Soy " + nombre + ", mi poder es " + superpoder + " y llevo capa");
		} else {
			System.out.println("Soy " + nombre + ", mi poder es " + superpoder + " y no llevo capa");
		}
		
	}
	
	public static void main (String[] args) {
		Superheroe sito = new Superheroe("Sito", "control del tiempo");
		
		sito.describir();
	}

}
