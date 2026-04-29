package examenProgramacionPOO2;

public class Alumno extends Persona{
	private double media;

	public Alumno(String dni, String nombre, double media) {
		super(dni, nombre);
		this.media = media;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy: " + super.getNombre() + ", con DNI: " + super.getDni() + " y media: " + this.media);
		
	}
	
	

}
