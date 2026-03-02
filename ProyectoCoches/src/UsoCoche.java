import java.util.Scanner;

public class UsoCoche {
	public static void main(String args[]) {
		Coche.miCoche = new Coche()
		miCoche.setMatricula("1234ABC");
		miCoche.setMarca("TOYOTA");
		miCoche.setModelo("YARIS");
		
		Coche.acelerar(75);
		Coche.frenar(19);
		System.out.println(Coche.toString());
		
		Scanner lector = new Scanner (System.in));
		String opcion = "";
		
		do {
			System.out.println("1. Acelerar");
			System.out.println("2. Frenar");
			System.out.println("3. Ver estado del coche");
			System.out.println("4. Termianr programa");
			System.out.println("-------------------------------------------------");
			System.out.println("¿Que opción eliges? ");
			opcion = lector.nextline();
		} while (!opcion.equals("4"));
		
		lector.close();
	}
}
