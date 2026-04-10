package practicar;

public class Gerente extends Empleado {
	private double bono;
	
	public Gerente(String nombre, double sueldoBase, double bono) {
		super(nombre, sueldoBase);
		this.bono = bono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override // Ajusto el sueldo para el Gerente
	public double calcularSueldo() {
		return sueldoBase + bono;
	}
	

}
