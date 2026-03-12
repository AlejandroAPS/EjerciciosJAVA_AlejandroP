public class Motor {
	private int caballos;
	private int tipoCombustible; // 0=gasolina, 1=diesel
	public Motor(int caballos, int tipoCombustible) {
		this.caballos = caballos;
		this.tipoCombustible = tipoCombustible;
}
	public int getCaballos() {
		return caballos;
	}
	public int getTipoCombustible() {
		return tipoCombustible;
	}
	public String estado() {
		return "Caballos: " + caballos + " Combustible: " + tipoCombustible;
	}
	
}