
public class Principal {

	public static void main(String[] args) {
		Animal a1 = new Tiranosaurio();
		Animal a2 = new Pulga();
		
		//Se muerden el uno al otro
		System.out.println(a1.morder(a2));
		System.out.println(a2.morder(a1));
		
		//Se mueven de lugar los dos 
		System.out.println(a1.mover());
		System.out.println(a2.mover());
		
	}

}
