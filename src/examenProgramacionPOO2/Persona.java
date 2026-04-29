package examenProgramacionPOO2;

public abstract class Persona {
	
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public abstract void presentarse();

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	

}
