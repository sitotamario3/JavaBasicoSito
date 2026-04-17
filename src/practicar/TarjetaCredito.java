package practicar;

public class TarjetaCredito extends MetodoPago{
		
	public TarjetaCredito() {
		super("Tarjeta de Crédito");
	}
	
	@Override //Metodo proceso pago tarjeta
	public  void procesarPago(double monto) {
		System.out.println("Se ha procesado el pago");
	}

}
