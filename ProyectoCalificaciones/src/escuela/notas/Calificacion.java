
package escuela.notas;

public class Calificacion {
	private String asignatura;
	private float nota;
	
	public Calificacion(String asignatura, float nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public Calificacion (float nota) {
		super();
		this.asignatura = "Sin especificar";
		this.nota = nota;
	}
	
	public Calificacion () {
		super();
		this.asignatura = "Sin especificar";
		this.nota = 0;
	}
	
	
	//GET Y SET =================================================
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	//===========================================================
	public String notaTexto() {
		if (this.nota < 3) return "Muy Deficiente";
		else if (this.nota < 5) return "Insuficiente";
		else if (this.nota < 6) return "Suficiente";
		else if (this.nota < 7) return "Bien";
		else if (this.nota < 9) return "Notable";
		else return "Sobresaliente";
	}
	
	public String notaTexto(boolean reducido) {
		if (reducido==false) return notaTexto();
		
		if (this.nota < 3) return "MD";
		else if (this.nota < 5) return "INS";
		else if (this.nota < 6) return "SUF";
		else if (this.nota < 7) return "BIEN";
		else if (this.nota < 9) return "NOT";
		else return "SOB";
	}

	@Override
	public String toString() {
		return getAsignatura() + ": " + getNota();
	}
}