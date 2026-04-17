package practicar;

public class Paypal extends MetodoPago{
	
	private String email;
	
	public Paypal(String email) {
		super("Paypal");
		this.email = email;
	}
	
	@Override // Metodo proceso pago para Paypal
	public void procesarPago(double monto) {
		System.out.println("Se ha procesado el pago en Paypal desde la cuenta: " + email );
	}

}
