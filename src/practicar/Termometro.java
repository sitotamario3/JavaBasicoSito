package practicar;

public class Termometro {
	private double temperatura;
	
	public void getTemperatura() {
		System.out.println(temperatura);
	}
	
	public void setTemperatura(double temperatura) {
		if (temperatura > -273.15) {
			this.temperatura = temperatura;
		} else {
			System.out.println("Error, la temperatura no puede ser de menos de -273.15");
		}	
		
	}
	
	public static void main (String [] args) {
		Termometro temp = new Termometro();
		
		temp.setTemperatura(500);
		
		temp.getTemperatura();
	}
	

}
