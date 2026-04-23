package practicar;

public class Coche {
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche(String marca, String modelo, String tipo, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		
		this.motor = new Motor(tipo, potencia);
	}
	
	public String getInfo() {
		return "Coche: " + this.marca + ", " + this.modelo + "\n" + motor.getInfo();
	}
	

}
