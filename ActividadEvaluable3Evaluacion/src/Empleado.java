
public class Empleado {
	private String nif;
	private String nombre;
	private int edad;
	
	//================ GETTERS AND SETTERS ======================
	public String getifF() {
		return this.nif;
	}
	public void setNif(String nIF) {
		this.nif = nIF;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//===========================================================
	
	public Empleado(String nIF, String nombre, int edad) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
	}
	
}
