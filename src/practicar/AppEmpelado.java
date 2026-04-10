package practicar;

public class AppEmpelado {

	public static void main(String[] args) {
			Gerente gerente = new Gerente("Pablo", 3500.50, 950.13);
			Desarrollador desarrollador1 = new Desarrollador("Emilio", 2487.59, "Java");
			Desarrollador desarrollador2 = new Desarrollador("Lucas", 2487.59, "Python");
			
			System.out.println(gerente.getNombre() + " :" + gerente.calcularSueldo());
			System.out.println(desarrollador1.getNombre() + " :" + desarrollador1.calcularSueldo());
			System.out.println(desarrollador2.getNombre() + " :" + desarrollador2.calcularSueldo());

	}

}
