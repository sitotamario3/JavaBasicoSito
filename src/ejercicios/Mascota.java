package ejercicios;

public class Mascota {
	
	String nombre;
	int hambre;
	int energia;
	
	public Mascota(String nombre, int hambre, int energia) {
		this.nombre = nombre;
		this.hambre = hambre;
		this.energia = energia;
				
	}
	
	public void comer() {
		hambre -=10;
	}
	
	public void jugar() {
		hambre +=15;
		energia -=20;
	}
	
	public void dormir() {
		energia+=100;
	}
}
