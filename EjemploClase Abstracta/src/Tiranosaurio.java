
public class Tiranosaurio extends Animal{

	public Tiranosaurio(){
		super("Tiranosaurio");
	}
	
	public String morder(Animal ani) {
		return "Tiranosaurio muerde a:" + ani.getNombre()
;	}
	
	public String mover() {
		return "El tiranosaurio se ha movido";
	}
}
