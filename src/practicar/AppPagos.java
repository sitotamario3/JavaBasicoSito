package practicar;

import java.util.ArrayList;

public class AppPagos {

	public static void main(String[] args) {
		ArrayList<MetodoPago> compra = new ArrayList<>( );
		
		compra.add(new TarjetaCredito());
		compra.add(new Paypal("mario@ejemplo.com"));
		
		for (MetodoPago p : compra) {
		    p.procesarPago(150.0); 
		    // Java buscará automáticamente si el objeto 'p' 
		    // es una Tarjeta o un Paypal y ejecutará el método correcto.
		}

	}

}
