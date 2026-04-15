import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int opcion = 0;
        
        
        System.out.println("==== Gestor Proyectos ====\r\n"
        					+ "1. Añadir empleado\r\n"
        					+ "2. Crear nuevo proyecto\r\n"
        					+ "3. Asignar proyecto a empleado\r\n"
        					+ "4. Añadir tareas a proyecto\r\n"
        					+ "5. Eliminar tareas de un proyecto\r\n"
        					+ "6. Eliminar proyecto\r\n"
        					+ "7. Despedir empleados\r\n"
        					+ "0. Cerrar gestor");
        opcion = lector.nextInt();
       switch(opcion) { 
       	case 1:
       		System.out.println("====Añadir empleado====");
       		System.out.println("DNI del empleado");
       		String nif = lector.nextLine();
       		System.out.println("Nombre del empleado");
       		String NombreE = lector.nextLine();
       		System.out.println("Edad del empleado");
       		int edadE = lector.nextInt();
       		break;
       	case 2:
       		System.out.println("Crear nuevo proyecto");
       	break;
       	
       	case 3:
       		System.out.println("Asignar protecto a empleado");
       	break;
       	
       	case 4:
       		System.out.println("Añadir tareas a proyecto");
       	break;
       	
       	case 5:
       		System.out.println("Eliminar tareas de proyecto");
       	break;
       	
       	case 6:
       		System.out.println("Eliminar proyecto");
       	break;
       	
       	case 7:
       		System.out.println("Despedir empleados");
       	break;
       	
       	case 0:
       		System.out.println("Apagando...");
       	break;
       	
       	default:
       		System.out.println("Por favor escoga una opción del menu, nigga");
       	break;
       }

	}

}
