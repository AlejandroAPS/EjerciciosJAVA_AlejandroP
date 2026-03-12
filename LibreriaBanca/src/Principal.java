import java.util.Scanner;
import banca.*;

public class Principal {
	public static void main(String[] args) {
		Cliente cli = new Cliente("77788899A" ,"Pepe","Gonzalo López", "617778899", "C/Oca 45");
		Cuenta cuenta1 = new Cuenta(cli, "ES34889922482949", 100);
		String opcion = ""; 
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Ingresar dinero");
			System.out.println("2. Retirar");
			System.out.println("3. Ver información cuenta");
			System.out.println("4. Salir del programa");
			
			opcion = lector.nextLine();
			
			switch(opcion) {
			case "1":
				System.out.println("Has seleccionado: Ingresar dinero");
				System.out.println("¿Cuanto dinero vas a ingresar?");
				double ingreso = lector.nextDouble();
				lector.nextLine(); //Limpiar memoria del lector  =IMPORTANTE=
				double saldo1 = cuenta1.ingresar(ingreso);
				System.out.println("Saldo después del ingrso: "+saldo1);
				break;
			case "2":
				System.out.println("Has seleciconado: Retirar dinero");
				System.out.println("¿Cuanto dinero vas a retirar?");
				double retirar = lector.nextDouble();
				lector.nextLine(); //Limpiar memoria del lector =IMPORTANTE=
				double saldo2 = cuenta1.retirar(retirar);
				System.out.println("Saldo después de la retirada: "+saldo2);
				break;
			case "3":
				System.out.println("Mostrando información de la cuenta:");
				System.out.println(cuenta1.toString());
				break;
			case "4":
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		}while(!opcion.equals("4"));
		
		lector.close();
		
	}
}
