import java.util.Scanner;

public class UsoCoche {
	public static void main(String[] args) {
		Coche miCoche = new Coche("1234ABC", "TOYOTA", "YARIS");
		Scanner lector = new Scanner (System.in);
		String opcion = "";
		
		System.out.println(Coche.informa);
		System.out.println("Coche contruidos: "+Coche.contadorCoches);
		System.out.println(Math.PI); //Ejemplo de variable estática
		
		
		do {
			System.out.println("1. Acelerar");
			System.out.println("2. Frenar");
			System.out.println("3. Ver estado del coche");
			System.out.println("4. Terminar programa");
			System.out.println("-------------------------------------------------");
			System.out.println("¿Que opción eliges? ");
			opcion = lector.nextLine();
			switch(opcion) {
			case "1":
				miCoche.acelerar(10);
				System.out.println("El coche a acelerado");
				break;
			case "2":
				miCoche.frenar(10);
				System.out.println("El coche ha frenado");
				break;
			case "3":
				System.out.println(miCoche.toString());
				break;
			case "4":
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (!opcion.equals("4"));
		lector.close();
	}
}
