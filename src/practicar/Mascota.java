package practicar;

public class Mascota {
	private String nombre;
	private int hambre;
	private int energia;
	
	public Mascota(String nombre, int hambre, int energia) {
		this.nombre = nombre;
		this.hambre = hambre;
		this.energia = energia;
	}
	
	public void comer() {
		hambre -= 10;
	}
	
	public void jugar() {
		hambre += 10;
		energia -=20;
	}
	
	public void dormir() {
		energia +=10;
	}
	
	public static void main (String [] args) {
		Mascota lucas = new Mascota("Lucas", 0, 100);
		
		System.out.println("Estado inical: " + lucas.nombre + ", " + lucas.hambre + ", " + lucas.energia);
		
		lucas.jugar();
		lucas.jugar();
		
		lucas.comer();
		
		System.out.println("Estado final: " + lucas.nombre + ", " + lucas.hambre + ", " + lucas.energia);
		
	}

}
