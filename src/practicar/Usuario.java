package practicar;

public class Usuario {
	private String username;
	private String password;
	private String email;
	
	public Usuario(String username, String password, String email) {
		this.username = username;
		setPassword(password);
		setEmail(email);
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		if (password.length() >= 8) {
			this.password = password;
		} else {
			System.out.println("Error, la contraseña debe contener 8 o más caracteres");
		}
	}
	
	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Por favor introduce un correo válido (falta '@'): ");
		}
	}
	
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Mario", "123", "asd@asdfg.com");
		
		// Verifico si funcionan los getters
		System.out.println(usuario1.getUsername());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getEmail());
		System.out.println();
		
		usuario1.setUsername("Pablo");
		usuario1.setPassword("Pa5");
		usuario1.setEmail("pabapadfgasfdg");
		System.out.println();
		
		// Verifico si funcionan los setters
		System.out.println(usuario1.getUsername());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getEmail());
		System.out.println();
		
	}

}
