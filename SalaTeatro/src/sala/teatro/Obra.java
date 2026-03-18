package sala.teatro;

public class Obra {
	private String nombre;
	private String compania;
	private int minutos;
	private int sala;
	private String genero;
	
	public Obra(String nombre, String compania, int minutos, int sala, String genero) {
		super();
		this.nombre = nombre;
		this.compania = compania;
		this.minutos = minutos;
		this.sala = sala;
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "====="+compania +"=====" + "\n" + 
			   "Nombre:" + nombre + "\n"+
			   "Genero:" + genero + "\n" +
			   "Duración:" + minutos + "\n" +
			   "Sala:" + sala + "\n";
	}
	
}
