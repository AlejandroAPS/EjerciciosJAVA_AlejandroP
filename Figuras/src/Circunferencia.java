public class Circunferencia extends Figura {
	private float radio;
	
	public Circunferencia(int coordenadaX, int coordenadaY, float radio) {
		super(coordenadaX, coordenadaY);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * (this.radio * this.radio);
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + ", toString()=" + super.toString() + "]";
	}
}