
public class Tarea {
	public String descripcion;
	public float HorasDuracion; 
	public int personalNecesario;
	public boolean terminada = false;
	public static final int MAX_PERSONAL = 5;
	
	
	public Tarea(String descripcion, float horasDuracion, int personalNecesario) {
		super();
		this.descripcion = descripcion;
		this.HorasDuracion = horasDuracion;
		this.personalNecesario = personalNecesario;
	}
	@Override
	public String toString() {
	    return "[" + descripcion + "] " +
	            HorasDuracion + "h, " +
	            personalNecesario + " personas, " +
	            (terminada ? "Terminada\r\n" : "Pendiente\r\n");
	}

//==================GETTER AND SETTERS=================================
	public boolean isTerminada() {
		return terminada;
	}

	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}


	public String getDescripcion() {
		return descripcion;
	}
	
//=========================================================================
	
}
