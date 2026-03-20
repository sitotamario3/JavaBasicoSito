package examenProgramacionPOO;

public class Casa extends Inmueble{

	private int numHabitaciones;
	private int numBaños;
	private int numPlantas;
	private Habitacion habitacion;
	
	public Casa(int idInmueble, String direccion, double precioVenta, double superficie, int numHabitaciones, int numBaños, int numPlantas,  String usoHabitacion, int superficieHabitacion, int numVentanas) {
		super(idInmueble, direccion, precioVenta, superficie);
		
		
		this.numHabitaciones = numHabitaciones;								
		this.numBaños = numBaños;
		this.numPlantas = numPlantas;
		habitacion = new Habitacion(superficieHabitacion, numVentanas, usoHabitacion);
			
				
	}
	
	public String getInfo() {
		
		
		return "Casa [id=" + idInmueble + ", dir=" + direccion + ", precio=" + precioVenta + ", m2=" + superficie + ", hab=" + numHabitaciones + ", baños=" + numBaños + ", plantas=" + numPlantas + "]\n" + 
	 habitacion.getInfo();
		
 	}
}



 


