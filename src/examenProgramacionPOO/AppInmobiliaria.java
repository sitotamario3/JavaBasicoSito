package examenProgramacionPOO;

public class AppInmobiliaria {

	public static void main(String[] args) {
		
		
		Local local1 = new Local(101, "Calle Mayor 5", 120000.0, 80.0, true);
		
		System.out.println(local1.getInfo());
		
		Casa casa1 = new Casa(202, "Av. del parque 12", 350000.0, 200.0, 4, 2, 3, "dormitorio", 15, 2);
		
		System.out.println(casa1.getInfo());

	}

}
