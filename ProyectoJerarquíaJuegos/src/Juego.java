
public class Juego {
	public String titulo;
	public String empresa;
	public int puntuacionBase;
	public Juego(String titulo, String empresa, int puntuacionBase) {
		super();
		this.titulo = titulo;
		this.empresa = empresa;
		this.puntuacionBase = puntuacionBase;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" + 
			   "Empresa: " + empresa + "\n" + 
			   "Puntuación Predeterminada: " + puntuacionBase;
	}
	
	public double calcularPuntuacionFinal() {
		return puntuacionBase;
	}
	
	
}
