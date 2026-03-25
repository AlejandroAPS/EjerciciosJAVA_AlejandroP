public class Moto implements Vehiculo {
	private String modelo;
	private int velocidad;
	private int cilindrada;
	
	public Moto(String modelo, int cilindrada) {
		super();
		this.modelo = modelo;
		this.velocidad = 0;
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + ", velocidad=" + velocidad + ", cilindrada=" + cilindrada + "]";
	}

	@Override
	public String frenar(int cuanto) {
		this.velocidad -= cuanto;
		return "Vas a " + this.velocidad + " km/hora con tu moto";
	}
	
	@Override
	public String acelerar(int cuanto) {
		this.velocidad += cuanto;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			return "Has sobrepasado la velocidad máxima, vas a " 
				+ this.velocidad + " km/hora con tu moto";
		}
			
		return "Vas a " + this.velocidad + " km/hora con tu moto";
	}
}