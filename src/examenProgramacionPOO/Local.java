package examenProgramacionPOO;

public class Local extends Inmueble{

	private boolean saleHumo;
	
	public Local(int idInmueble, String direccion, double precioVenta, double superficie, boolean saleHumo) {
		super(idInmueble, direccion, precioVenta, superficie);
		this.saleHumo = saleHumo;		
	}
	
	public String getInfo() {
		return "Local [id=" + idInmueble + ", dir=" + direccion + ", precio=" + precioVenta + ", m2=" + superficie + "salidaHumos" + saleHumo + "]";
 	}
}
