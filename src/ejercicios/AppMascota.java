package ejercicios;

public class AppMascota {

	public static void main(String[] args) {
		
		Mascota mascota1 = new Mascota("storm", 0, 100);
		
		System.out.println("Estado inicial: ");
		
		System.out.println("nombre: " +  mascota1.nombre + ", hambre: " + mascota1.hambre + ", energia: " + mascota1.energia);
		
		mascota1.jugar();
		mascota1.jugar();
		
		mascota1.comer();
		
		System.out.println("Estado final: ");
		
		System.out.println("nombre: " +  mascota1.nombre + ", hambre: " + mascota1.hambre + ", energia: " + mascota1.energia);
		
	}

}
