package practicar;

public class Desarrollador extends Empleado {
	private String lenguajePrincipal;
	
	public Desarrollador(String nombre, double sueldoBase, String lenguajePrincipal) {
		super(nombre, sueldoBase);
		this.lenguajePrincipal = lenguajePrincipal;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override // Cambio el salario dependiendo del lenguaje del desarrollador
	public double calcularSueldo() {
		if (lenguajePrincipal.equalsIgnoreCase("java")) {
			sueldoBase += 500;
		}		
		return sueldoBase;
	}
}
