package Practicar;

public class Producto {
	
	String nombre;
	double precio;
	int cantidadEnStock;
	
	public Producto (String nombre, double precio, int cantidadEnStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre + ", precio: " + precio + ", cantidad en stock: " + cantidadEnStock);
	}
	
	
	// Hay que corregir esto de aqui, pues no puede ser int, ya que debe poder salir el mensaje de error si no hay suficiente.
	public int vender(int cantidad) {
		if (cantidadEnStock > cantidad) {
			cantidadEnStock = cantidadEnStock - cantidad;
		} else {
			System.out.println("Error, no hay stock suficiente");
		}
		return cantidadEnStock;
	}
	
	public static void main (String[] args) {
		Producto producto1 = new Producto("Champu", 1.5, 50);
		
		producto1.mostrarInformacion();
		System.out.println("stock: " + producto1.vender(55));
	}

}
