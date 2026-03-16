
public class Alumno extends Persona {
	private int numMatricula;
	
	public Alumno(String nombre, String telefono, int numMatricula) {
		super(nombre,telefono);
		this.numMatricula = numMatricula;
	}
	
	public String toString() {
		return " Matricula ºn "+numMatricula+","+ ", " + super.toString();
	}
}
