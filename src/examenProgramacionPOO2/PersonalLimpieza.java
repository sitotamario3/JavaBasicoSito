package examenProgramacionPOO2;

public class PersonalLimpieza extends PAS{
	
	private String turno;

	public PersonalLimpieza(String dni, String nombre, String zonaTrabajo, String turno) {
		super(dni, nombre, zonaTrabajo);
		this.turno = turno;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy: " + super.getNombre() + ", con DNI: " + super.getDni() + ", mi zona de trabajo es: " + super.getZonaTrabajo() +  " y mi turno: " + this.turno);
		
	}
	
	

}
