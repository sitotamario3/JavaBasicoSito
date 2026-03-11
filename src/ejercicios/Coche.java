package ejercicios;

public class Coche {
	
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche(String marca, String modelo, String tipo, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		motor = new Motor(tipo, potencia);
		
	}
	
	public String getInfo() {
		return "Marca: " + marca +", modelo: " +modelo + ", detalles motor: " + motor.getInfo();
	}

}
