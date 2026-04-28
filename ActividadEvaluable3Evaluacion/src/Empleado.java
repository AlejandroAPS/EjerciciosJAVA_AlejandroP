public class Empleado {
	private String nif;
	private String nombre;
	private int edad;
	
	//================ GETTERS AND SETTERS ======================
	public String getNif() {
		return this.nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
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
	
	public Empleado(String nif, String nombre, int edad) throws EdadInvalidaException {
		if (edad<0) {
			throw new EdadInvalidaException("Edad no válida");
		}
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	@Override
	public String toString() {
		return "[" + nif + "]"
				+ nombre + 
				"," + edad + " años\r\n";
	}
	
	
	
}