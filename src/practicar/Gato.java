package practicar;

public class Gato extends Animal {
	
	public Gato(String nombre) {
		super(nombre);
	}
	
public static void main(String[] args) {
	
	Gato bimbo = new Gato("Bimbo");
	
	System.out.println(bimbo.hacerSonido());
}

}
