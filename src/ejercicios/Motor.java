package ejercicios;

public class Motor {

	private String tipo;
	private int potencia;
	
	public Motor(String tipo, int potencia) {
		this.tipo = tipo;
		this.potencia = potencia;
		
		
	}
	
	public String getInfo() {
		return "Tipo de motor: " + tipo + ", potencia: " + potencia;
	}
}
