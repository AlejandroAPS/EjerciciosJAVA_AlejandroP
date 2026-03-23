
public class Pulga extends Animal{
	
	public Pulga() {
		super("Pulga");
	}
	
	public String morder(Animal ani) {
		return ("La pulga muerde a: " + ani.getNombre());
	}
	
	public String mover() {
		return "La pulga se ha movido";
	}
	
}
