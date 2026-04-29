package examenProgramacionPOO2;

public abstract class PAS extends Persona{
	private String zonaTrabajo;

	public PAS(String dni, String nombre, String zonaTrabajo) {
		super(dni, nombre);
		this.zonaTrabajo = zonaTrabajo;
	}

	public String getZonaTrabajo() {
		return zonaTrabajo;
	}
	
	
	
	

}
