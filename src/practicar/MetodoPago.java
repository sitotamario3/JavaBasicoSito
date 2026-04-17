package practicar;

public abstract class MetodoPago {
	
	protected String tipo;
	
	public MetodoPago(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void procesarPago(double monto);

}
