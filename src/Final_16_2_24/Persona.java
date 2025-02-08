package Final_16_2_24;

public class Persona {
	private String nombre;
	private String apellido;
	private String email;

	public Persona(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public boolean equals(Object o) {
		try {
			Persona otra = (Persona) o;
			return this.getApellido().equals(otra.getApellido()) && this.getNombre().equals(otra.getNombre())
					&& this.getEmail().equals(otra.getEmail());
		} catch (Exception e) {
			return false;
		}
	}

}
