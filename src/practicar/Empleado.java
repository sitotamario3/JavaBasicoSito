package practicar;

public class Empleado {
	public String nombre;
	protected double sueldoBase;
	
	public Empleado(String nombre, double sueldoBase) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	public double calcularSueldo() {
		return sueldoBase;
	}

	
}
