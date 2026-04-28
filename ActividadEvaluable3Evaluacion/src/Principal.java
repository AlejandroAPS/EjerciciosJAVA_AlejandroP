import java.util.Scanner;//Scanner lector
import java.util.ArrayList;//Lista de arrays (lista empleados y proyectos etc.)
import java.util.InputMismatchException;//Exception de cuando el usuairo pone por ejejmplo un numero y tiene que poner un texto
public class Principal {
		
	//array list que guarda TODOS los empleados que cree el usuario y TODOS los proyectos
	static ArrayList<Empleado> empleados = new ArrayList<>();
	static ArrayList<Proyecto> proyectos = new ArrayList<>();
		
		public static void anadirEmpleado(Scanner lector) {
			System.out.println("====Añadir empleado====");
			System.out.println("DNI del empleado");
			String nif = lector.nextLine();
			System.out.println("Nombre:");
			String nombreE = lector.nextLine();
			int edadE;
			try{
				System.out.println("Edad:");
				edadE = lector.nextInt();
				lector.nextLine();
				//catch que se activa cuando el usuario pone algo que NO sea un número entero
			}catch(java.util.InputMismatchException e){
				System.out.println("Porfavor introduzca un número válido");
				lector.nextLine();
				return;//vuelve al menú principal
			}
			try {
			Empleado e = new Empleado(nif,nombreE,edadE);
			empleados.add(e);
			//este try catch personalizado es para cuando la edad del usuario es menor a 0
			System.out.println("Empleado añadido correctamente");
			}catch (EdadInvalidaException e1){
				System.out.println(e1.getMessage());
			}
		}
		
		public static void nProyecto(Scanner lector) {
			System.out.println("=======Nuevo Proyecto======");
			System.out.println("Nombre:");
			String nombre = lector.nextLine();
			Proyecto p =new Proyecto(nombre);
			if(empleados.isEmpty()) {
			//si el usuario no ha creado ningún empleado le manda para atrás
				System.out.println("No hay empleados disponibles para asignar");
				return;	
			}else {
			//si SI hay empleados imprime toda la lista de los empleados a escoger
				System.out.println("\n Lista de empleados ");
				for (int i = 0; i < empleados.size(); i++) {
					System.out.println(i + ". " + empleados.get(i));
				}
				//se crea opcion antes del bucle para que no de fallo
				int opcion;
				do{
					System.out.print("Selecciona empleado (-1 para terminar): ");
						opcion = lector.nextInt();
						//limpiar el buffer
						lector.nextLine();
						
						if (opcion >= 0 && opcion < empleados.size()) {
							Empleado seleccionado = empleados.get(opcion);
						//No deberias de poder agregar dos veces al mismo empleado a un proyecto 
						    if (p.getEmpleados().contains(seleccionado)) {
						        System.out.println("Ese empleado ya está asignado al proyecto.");
						        continue;
						    }
						    //agrega el empleado con el numero elegido por el usuario
							p.agregarEmpleado(empleados.get(opcion));
							System.out.println("Empleado " + seleccionado.getNombre() + "añadido al proyecto.");
						} else if (opcion != -1) {
							System.out.println("Índice no válido.");
						}
				}while (opcion != -1);  
			}
			proyectos.add(p);
			System.out.println("Proyecto creado correctamente");
			
		}
		
		public static void anadirTareas(Scanner lector) {
			System.out.println("Escoge un Proyecto:");
			if(proyectos.isEmpty()) {
				System.out.println("No hay ningún proyecto creado al que asignar tareas");
				return;
			}else {
				System.out.println("\n Lista de proyectos ");
				
				for (int i = 0; i < proyectos.size(); i++) {
					System.out.println(i + ". " + proyectos.get(i));
				}
			}
			int opcion;
					opcion = lector.nextInt();
					lector.nextLine(); 
					Proyecto proyectoE = null;

					if (opcion >= 0 && opcion < proyectos.size()) {
						proyectoE = proyectos.get(opcion);
						System.out.println("Proyecto " + proyectoE.getNombre() + " elegido.");
					} else {
						System.out.println("Índice no válido.");
						return;
					}
			String continuar = "s";
		do {	
			System.out.println("====Añadir Tarea====");
				System.out.println("Nombre tarea");
				String nombre = lector.nextLine();
				System.out.println("Duracion Horas");
				float horas;
				try{
					horas = lector.nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Introduzca un número valido porfavor");
					lector.nextLine();
					continue;
				}
				
				lector.nextLine();
				System.out.println("Nº Personal necesario");
				int personal = lector.nextInt();
				lector.nextLine(); //limpiar lo que habia en el lector
				
				if (personal > Tarea.MAX_PERSONAL) {
				    System.out.println("No se puede asignar tanto personal");
				    continue;
				}
				Tarea nTarea = new Tarea(nombre,horas,personal);
				proyectoE.agregarTarea(nTarea);
	
				System.out.print("¿Añadir otra tarea? (s/n): ");
				continuar = lector.nextLine();
				
		}while (!continuar.equals("n"));
	}
		
		
		public static void terminarTarea(Scanner lector) {

		    System.out.println("Escoge un Proyecto:");

		    if (proyectos.isEmpty()) {
		        System.out.println("No hay ningún proyecto creado al que asignar tareas");
		        return;
		    }

		    System.out.println("\n Lista de proyectos ");

		    for (int i = 0; i < proyectos.size(); i++) {
		        System.out.println(i + ". " + proyectos.get(i));
		    }

		    int opcion = lector.nextInt();
		    lector.nextLine();

		    Proyecto proyectoE;

		    if (opcion >= 0 && opcion < proyectos.size()) {
		        proyectoE = proyectos.get(opcion);
		        System.out.println("Proyecto " + proyectoE.getNombre() + " elegido.");
		    } else {
		        System.out.println("Índice no válido.");
		        return;
		    }

		    if (proyectoE.getTareas().isEmpty()) {
		        System.out.println("No hay ninguna tarea en este proyecto");
		        return;
		    }

		    String seguir;

		    do {

		        
		        System.out.println("\n==== LISTA DE TAREAS ====");

		        for (int i = 0; i < proyectoE.getTareas().size(); i++) {
		            Tarea t = proyectoE.getTareas().get(i);

		            System.out.println(
		                i + ". " + t.getDescripcion() +
		                " -> " + (t.isTerminada() ? "COMPLETADA" : "PENDIENTE")
		            );
		        }

		        System.out.println("\nElige una tarea:");
		        int tareaIndex = lector.nextInt();
		        lector.nextLine();

		        if (tareaIndex >= 0 && tareaIndex < proyectoE.getTareas().size()) {

		            Tarea t = proyectoE.getTareas().get(tareaIndex);

		            
		            t.setTerminada(!t.isTerminada());

		            System.out.println("Cambiaste el estado de: " + t.getDescripcion());

		        } else {
		            System.out.println("Índice de tarea no válido.");
		        }

		        System.out.println("\n¿Quieres seguir cambiando tareas? (s/n)");
		        seguir = lector.nextLine();

		    } while (seguir.equalsIgnoreCase("s"));
		}
		
		public static void verProyectos() {
			if(proyectos.isEmpty()) {
				System.out.println("No hay ningún proyecto creado");
				return;
			}else {
				System.out.println("\n Lista de proyectos ");
				
				for (int i = 0; i < proyectos.size(); i++) {
					System.out.println(i + ". " + proyectos.get(i));
				}
			}
		}
		
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in); // se crea el lector que reusaremos
			int opcion = -1; 
			
			do {
			System.out.println("==== Gestor Proyectos ====\r\n"
								+ "1. Añadir empleado\r\n"
								+ "2. Crear nuevo proyecto\r\n"
								+ "3. Añadir tareas a proyecto\r\n"
								+ "4. Marcar tareas como completadas\r\n"
								+ "5. Ver todos proyectos\r\n" // el menú principal
								+ "0. Cerrar gestor\r\n"
								+ "(Se recomienda primero crear todos los empleados\r\n" 
								+ " y luego crear los proyectos y luego asignarles sus tareas)");
			try {
			opcion = lector.nextInt();
			//siempre habra nextline despues de un lector.nextalgo que no sea line para limpiar todo el buffer
			lector.nextLine(); 
			}catch(java.util.InputMismatchException e)
			//catch para que no pongas caracteres NO numericos en el menu principal
			{
				System.out.println("Por favor introduzca un número");
				lector.nextLine();
				continue;
				//si se activa la excepcion avisa a usuario y continua en el bucle
			}		
			switch(opcion) { //switch que lleva a todas las opciones del menú 
			case 1:
				anadirEmpleado(lector);
			break;
			case 2:
				nProyecto(lector);
			break;
			
			case 3:
				anadirTareas(lector);
			break;
			
			case 4:
				terminarTarea(lector);
			break;
			
			case 5:
				verProyectos();
			break;
			case 0:
				System.out.println("Apagando...");
			break;
			
			default://aqui por si ponen un numero que no se encuentre en la lista
				System.out.println("Por favor escoga una opción del menu");
			break;
		}
		//Tal como se indica en el menú si escribes 0 terminas el programa
		}while(opcion !=0); 

	}
}
