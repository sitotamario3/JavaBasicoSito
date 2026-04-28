package practicar;

public class Perro extends Animal{
	
	public Perro(String nombre) {
		super(nombre);
	}
	
public static void main(String[] args) {
	Perro rufo = new Perro("Rufo");
	
	System.out.println(rufo.hacerSonido());
}

}
