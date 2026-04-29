package practicar;

public class Alumno {
	private String nombre;
	private String dni;
	private int numMatricula;
	
	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;		
		this.numMatricula = -1;
	}
	
	public String getAlumno() {
		return "Nombre: " + nombre + ", DNI: " + dni + ", Matrícula: " + numMatricula;
	}
	
	public void mostrarDatos() {
		System.out.println(getAlumno());
	}
	
	public void matricular(int numMatricula) {
		this.numMatricula = numMatricula;
	}

}
