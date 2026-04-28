import java.util.Scanner;//Scanner lector
import java.util.ArrayList;//Lista de arrays (lista empleados y proyectos etc.)
import java.util.InputMismatchException;//Exception de cuando el usuairo pone por ejejmplo un numero y tiene que poner un texto
public class Principal {
		
	//array list que guarda TODOS los empleados que cree el usuario y TODOS los proyectos
	static ArrayList<Empleado> empleados = new ArrayList<>();
	static ArrayList<Proyecto> proyectos = new ArrayList<>();
		//crear empleados en el arraylist empleados
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

		//crear proyectos
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

						try { //try catch para ver si el usuario pulsa un número o no
							System.out.print("Selecciona empleado (-1 para terminar): ");
							opcion = lector.nextInt();
							//limpiar el buffer
							lector.nextLine();
						}catch(java.util.InputMismatchException e){
							System.out.println("Por favor pulse un número válido");
							return;
						}

						if (opcion >= 0 && opcion < empleados.size()) {
							Empleado seleccionado = empleados.get(opcion);
						//No deberias de poder agregar dos veces al mismo empleado a un proyecto 
						    if (p.getEmpleados().contains(seleccionado)) {
						        System.out.println("Ese empleado ya está asignado al proyecto.");
						        continue;
						    }
						    //agrega el empleado con el numero elegido por el usuario
							p.agregarEmpleado(empleados.get(opcion));
							System.out.println("Empleado " + seleccionado.getNombre() + " añadido al proyecto.");
						} else if (opcion != -1) {
							System.out.println("Índice no válido.");
						}
				}while (opcion != -1);
			//Se mantiene en bucle pudiendo seleccionar multiples empleados hasta que user pulas -1
			}
			proyectos.add(p); //agrega el proyecto al array list de proyectos
			System.out.println("Proyecto creado correctamente");
			
		}

		//crear tareas en los proyectos ya existentes
		public static void anadirTareas(Scanner lector) {
			System.out.println("Escoge un Proyecto:");
			//si no hay ningún proyecto creado devuelve al usuario para atras
			if(proyectos.isEmpty()) {
				System.out.println("No hay ningún proyecto creado al que asignar tareas");
				return;
			}else {//si SI hay proyectos se muestran pues
				System.out.println("\n Lista de proyectos ");
				//con este bucle va proyecto por proyecto mostrandolo usando el toString del proyecto
				for (int i = 0; i < proyectos.size(); i++) {
					System.out.println(i + ". " + proyectos.get(i));
				}
			}
					//variabls opcion para que el usuario vaya eligiendo que proyecto quiere
					int opcion;
					opcion = lector.nextInt();
					lector.nextLine();
					Proyecto proyectoE = null;
					//si es elegible y esta dentro del rango de los proyectos existentes continua y si no devuelve a menu principal
					//(podria haber usado un try catch la verdad)
					if (opcion >= 0 && opcion < proyectos.size()) {
						proyectoE = proyectos.get(opcion);
						System.out.println("Proyecto " + proyectoE.getNombre() + " elegido.");
					} else {
						System.out.println("Índice no válido.");
						return;
					}
			String continuar = "s";
		//Con este bucle vas añadiendo tareas hasta que el usuario quiera parar
		do {
			System.out.println("====Añadir Tarea====");
				System.out.println("Nombre tarea");
				String nombre = lector.nextLine();
				System.out.println("Duración Horas");
				float horas;
				try{//try para que el usuairo ponga un numero y no una letra
					horas = lector.nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Introduzca un número valido porfavor");
					lector.nextLine();
					continue;
				}
				
				lector.nextLine();
				System.out.println("Nº Personal necesario");
				int personal = lector.nextInt();
				lector.nextLine(); //limpiar lo que había en el lector (buffer)

				//si intentas agregar personal por encima del permitido repites el bucle de crear tarea
				if (personal > Tarea.MAX_PERSONAL) {
				    System.out.println("No se puede asignar tanto personal");
				    continue;
				}
				//se agrega la tarea al tener ya todos los datos
				Tarea nTarea = new Tarea(nombre,horas,personal);
				proyectoE.agregarTarea(nTarea);
				//se pregunta si quieres añadir otra tarea
				System.out.print("¿Añadir otra tarea? (s/n): ");
				continuar = lector.nextLine();
			//si pulsa n termina el bucle
		}while (!continuar.equals("n"));
	}
		
		//marcar tareas como completadas o incompletas
		public static void terminarTarea(Scanner lector) {

		    System.out.println("Escoge un Proyecto:");
			//si no hay proyectos para fuera
		    if (proyectos.isEmpty()) {
		        System.out.println("No hay ningún proyecto creado al que asignar tareas");
		        return;
		    }

		    System.out.println("\n Lista de proyectos ");
			//muestra todos los proyectos
		    for (int i = 0; i < proyectos.size(); i++) {
		        System.out.println(i + ". " + proyectos.get(i));
		    }

		    int opcion = lector.nextInt();
		    lector.nextLine();
			//toda esta sección es para que puedas elegir un proyecto de entre las opciones
		    Proyecto proyectoE;

		    if (opcion >= 0 && opcion < proyectos.size()) {
		        proyectoE = proyectos.get(opcion);
		        System.out.println("Proyecto " + proyectoE.getNombre() + " elegido.");
		    } else {//si hay 4 por ejemplo y escoges el 6 acabas aquí por portarte mal
		        System.out.println("Índice no válido.");
		        return;
		    }

			//si no tiene tareas dicho proyecto pues no vas a cambiar nada asi que para fuera
		    if (proyectoE.getTareas().isEmpty()) {
		        System.out.println("No hay ninguna tarea en este proyecto");
		        return;
		    }

			//inicializa seguir
		    String seguir;

		    do {
		        System.out.println("\n==== LISTA DE TAREAS ====");
				//con esto devuelve la lista de todas las tareas de dicho proyecto y muestra si estan completadas o no
		        for (int i = 0; i < proyectoE.getTareas().size(); i++) {
		            Tarea t = proyectoE.getTareas().get(i);

		            System.out.println(
		                i + ". " + t.getDescripcion() +
		                " -> " + (t.isTerminada() ? "COMPLETADA" : "PENDIENTE")
		            );
		        }

				//permite elegir una de ellas aqui
		        System.out.println("\nElige una tarea:");
		        int tareaIndex = lector.nextInt();
		        lector.nextLine();
				//if que revisa que escogiste una tarea válida
		        if (tareaIndex >= 0 && tareaIndex < proyectoE.getTareas().size()) {
		            Tarea t = proyectoE.getTareas().get(tareaIndex);
		            t.setTerminada(!t.isTerminada());
					//muestra al usuario que realmente toco algo
					//mostrar feedback al usuario de que lo que toca importa y cambian las cosas se siente bien
		            System.out.println("Cambiaste el estado de: " + t.getDescripcion());

		        } else {
		            System.out.println("Índice de tarea no válido.");
		        }

				//te pregunta si quieres seguir cambiando tareas
		        System.out.println("\n¿Quieres seguir cambiando tareas? (s/n)");
		        seguir = lector.nextLine();
			//si s pues sigues cambiando tareas
		    } while (seguir.equals("s"));
		}
		//vale este es simple pero relevante
		//simplemente reusa código ya hecho para que el usuario pueda ver los proyectos de forma cómoda
		public static void verProyectos() {
			if(proyectos.isEmpty()) {//si no hay ningun proyecto te saca fuera
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
