import java.util.Scanner;

import sala.teatro.Cliente;
import sala.teatro.Obra;
import sala.teatro.Teatro;

public class Principal {

	public static void main(String[] args) {
		// Aqui se deberia de crear los distintos clientes objetos o no se qu wea
		Obra obra = new Obra("Sombras del Tiempo", "Teatro Luna Roja",95,3,"Drama");
		Teatro teatro = new Teatro("Calle los tapujos 8 ", obra);
		
		String opcion = ""; 
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Ver butacas libres");
			System.out.println("2. Ver butacas ocupadas");
			System.out.println("3. Ver todas las butacas");
			System.out.println("4. Reservar butaca");
			System.out.println("5. Ver programación");
			System.out.println("6. Cancelar reserva");
			System.out.println("7. Terminar programa");
			
			opcion = lector.nextLine();
			
			switch(opcion) { //metes el codigo correspondiente despues del syso en cada opcion 
			case "1":
				System.out.println("Has seleccionado ver butacas libres");
				System.out.println(teatro.soymingitoLibre());
				break;
			case "2":
				System.out.println("Has seleccionado ver butacas ocupadas");
				System.out.println(teatro.soymingitoOcupada());
				break;
			case "3":
				System.out.println("Has seleccionado ver todas las butacas");
				System.out.println(teatro.soymingito());
				break;
			case "4":
				System.out.println("Has seleccionado reservar butaca");
				
				String nombre = "";
				String dni = "";
				String tlf = "";
				Scanner homeloChino = new Scanner(System.in);
				
				System.out.println("Dime el nombre del cliente");
				nombre = homeloChino.nextLine();
				System.out.println("Dime el DNI");
				dni = homeloChino.nextLine();
				System.out.println("Dime el teléfono");
				tlf = homeloChino.nextLine();
				
				
				
				break;
			case "5":
				System.out.println("Has seleccionado ver programación");
				System.out.println(obra);
				break;
			case "6":
				System.out.println("Has seleccionado cancelar reserva");
				
				break;
			case "7":
				System.out.println("Has seleccionado salir del programa");
				System.out.println("Terminando programa....");
				break;
			default:
				System.out.println("Opción no valida , nigga");
				break;
			}
			
		}while(!opcion.equals("7"));
		
		lector.close();
		
	}
}


