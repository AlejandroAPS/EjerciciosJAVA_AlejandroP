import java.util.ArrayList; // Importaciónes necesarias
import java.util.List;
import java.util.Scanner;


public class Principal {
	
	
	
	//Actualiza el array ventas y crea el objeto con la info de la bebida de turno
	public static void registrarVenta(ArrayList<The_Drink> ventas , //pedimos el array en si
									String nombre,	//y los datos de la bebida a introducir
									double precio,
									String fabricante) {
	    ventas.add(new The_Drink(nombre, precio, fabricante));
	}
	
	
	public static void introduccionMonedas(double precio) {
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		double introducido = 0; 
		double aIntroducir = 0;
		ArrayList<The_Drink> ventas = new ArrayList<>();
		System.out.println("==== Introducción Monedas ====\r\n"
        					+ "1. 0,01€\r\n"
        					+ "2. 0,02€\r\n"
        					+ "3. 0,05€\r\n"
        					+ "4. 0,10€\r\n"
        					+ "5. 0,20€\r\n"
        					+ "6. 0,50€\r\n"
        					+ "7. 1,00€\r\n"
        					+ "8. 2,00€\r\n");
		do {
			opcion = lector.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduciste un céntimo");
				aIntroducir = 0.01;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 2:
				System.out.println("Introduciste dos céntimos");
				aIntroducir = 0.02;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 3:
				System.out.println("Introduciste cinco céntimos");
				aIntroducir = 0.05;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
			break;
       	
			case 4:
				System.out.println("Introduciste diez céntimos");
				aIntroducir = 0.10;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 5:
				System.out.println("Introduciste veinte céntimos");
				aIntroducir = 0.20;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 6:
				System.out.println("Introduciste cincuenta céntimos");
				aIntroducir = 0.50;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 7:
				System.out.println("Introduciste un euro");
				aIntroducir = 1.00;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			case 8:
				System.out.println("Introduciste dos euros");
				aIntroducir = 2.00;
				introducido += aIntroducir;
				System.out.println("Llevas:" + introducido);
				break;
       	
			default:
				System.out.println("tos tu muertos");
				break;
			}
		}while(introducido <= precio); //Lo repite hasate que hayas metido sea igual o mayor al precio
		//Ahora calcular el sobrante para devolver las monedas sobrantes
		if (introducido >  precio) {
			double cambio = introducido - precio;
			System.out.println("¡De la máquina salieron " + cambio + "€!");
		}
	}
	 
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int opcion = 0;
        
        
        System.out.println("==== Máquina Expendedora ====\r\n"
        					+ "1. Agua mineral 	- 1.00 €\r\n"
        					+ "2. Coca-Cola 		- 1.20 €\r\n"
        					+ "3. Aquarius Naranja 	- 1.20 €\r\n"
        					+ "4. Aquarius Limón 	- 1.20 €\r\n"
        					+ "5. Fanta Naranja 	- 1.25 €\r\n"
        					+ "6. Fanta Limón 		- 1.25 €\r\n"
        					+ "0. Cerrar máquina");
        //Aqui arriba podria poner un codigo con un simple if para asegurarme que el bobo
        //del usuario ponga un int y no un double pero no me apetece
        opcion = lector.nextInt();
       double precio = 0;
       switch(opcion) { //Esta seccion esta por supuesto sin acabar
       	case 1:
       		System.out.println("Has elegido Agua mineral");
       		precio = 1.00;
       		introduccionMonedas(precio);
       	break;
       	
       	case 2:
       		System.out.println("Coca-Cola");
       		precio = 1.20;
       		introduccionMonedas(precio);
       	break;
       	
       	case 3:
       		System.out.println("Aquarius Naranja");
       		precio = 1.20;
       		introduccionMonedas(precio);
       	break;
       	
       	case 4:
       		System.out.println("Aquarius Limón");
       		precio = 1.20;
       		introduccionMonedas(precio);
       	break;
       	
       	case 5:
       		System.out.println("Fanta Naranja");
       		precio = 1.25;
       		introduccionMonedas(precio);
       	break;
       	
       	case 6:
       		System.out.println("Fanta Limón");
       		precio = 1.25;
       		introduccionMonedas(precio);
       	break;
       	
       	case 0:
       		System.out.println("Apagando...");
       	break;
       	
       	default:
       		System.out.println("Por favor escoga una opción del menu");
       	break;
       }
	}

}
