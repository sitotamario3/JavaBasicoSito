package examenProgramacionPOO2;

public class Profesor extends Persona{
	
	private String especialidad;

	public Profesor(String dni, String nombre, String especialidad) {
		super(dni, nombre);
		this.especialidad = especialidad;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy: " + super.getNombre() + ", con DNI: " + super.getDni() + " de la especialidad: " + this.especialidad);
		
	}
	
	

}
