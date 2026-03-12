

public class PlazaGaraje {
	public int numero;
	public int planta;
	public String dimensiones;
	public Coche coche;
	
	//Constructor
	public PlazaGaraje(int numero, int planta, String dimensiones) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.dimensiones = dimensiones;
	}

	public void aparca(Coche coche){
		this.coche = coche;
		System.out.println("Se ha aparcado el coche con matrícula: " + coche.getMatricula());
	}
	
	public void desaparca() {
		this.coche = null;
	}
	
}
