package sala.teatro;

public class Cliente {
	private String nombre;
	private String tlf;
	private String dni;
	
	public Cliente(String nombre, String tlf, String dni) {
		super();
		this.nombre = nombre;
		this.tlf = tlf;
		this.dni = dni;	
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tlf=" + tlf + ", dni=" + dni + "]";
	}

	// GETTER AND SETTER ==================================
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	//=====================================================
	
}
