package banca;

/**
 * Representa un cliente de una tentidad bancaria.
 */
public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private String tlf;
	private String domicilio;
	
/**
 * Constructor que recibe todos los datos del cliente.	
 * @param dni
 * @param nombre
 * @param apellidos
 * @param tlf
 * @param domicilio
 */
	public Cliente(String dni, String nombre, String apellidos, String tlf, String domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tlf = tlf;
		this.domicilio = domicilio;
	}
/**
 * Contructor que recibe dni, nombre y apellidos.
 * tlf y domicilio lo rellana con cadena vacia
 * @param dni
 * @param nombre
 * @param apellidos
 */
	
	public Cliente(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tlf = "";
		this.domicilio = "";
	}

/**
 * Constructor que asigna cadena vacía a todos los argumentos.
 * 
 */
	public Cliente() {
	super();
	this.dni = "";
	this.nombre = "";
	this.apellidos = "";
	this.tlf = "";
	this.domicilio = "";
	}
@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tlf=" + tlf + ", domicilio="
			+ domicilio + "]";
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


}