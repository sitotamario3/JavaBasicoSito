package practicar;

public class Animal {
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public String hacerSonido() {
		return nombre + " emite un sonido";
	}
	
	public String getNombre() {
		return nombre;
	}

}
