package examenProgramacionPOO;

public class Habitacion {

	private int superficieHabitacion;
	private int numVentanas;
	private String usoHabitacion;
	
	public Habitacion(int superficieHabitacion, int numVentanas, String usoHabitacion) {
		this.superficieHabitacion = superficieHabitacion;
		this.numVentanas = numVentanas;
		this.usoHabitacion = usoHabitacion;
	}
	
	public String getInfo() {
		return "Habitación: [uso=" + usoHabitacion + ", m2=" + superficieHabitacion + ", ventanas=" + numVentanas + "]";
 	}
	
}
