package examenProgramacionPOO2;

public class Administrativo extends PAS{
	
	private String puesto;

	public Administrativo(String dni, String nombre, String zonaTrabajo, String puesto) {
		super(dni, nombre, zonaTrabajo);
		this.puesto = puesto;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy: " + super.getNombre() + ", con DNI: " + super.getDni() + ", mi zona de trabajo es: " + super.getZonaTrabajo() +  " y mi puesto es: " + this.puesto);
		
	}
	
	

}
