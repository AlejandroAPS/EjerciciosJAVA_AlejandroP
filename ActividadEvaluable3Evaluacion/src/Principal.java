	import java.util.Scanner;
	import java.util.ArrayList;
		



	public class Principal {
		
		public static void anadirEmpleado() {
			Scanner lector = new Scanner(System.in);
			System.out.println("====Añadir empleado====");
			System.out.println("DNI del empleado");
			String nif = lector.nextLine();
			System.out.println("Nombre:");
			String nombreE = lector.nextLine();
			try{
				int edadE = lector.nextInt();
				System.out.println("Edad:");
			}catch(java.util.InputMismatchException e){
				System.out.println("Porfavor introduzca un número");
				lector.nextLine();
				return;
			}
			Empleado e = new Empleado(nif,nombreE,edadE);
			empleados.add(e);
			System.out.println("Empleado añadido correctamente");
			
		}
		
		public static void nProyecto() {
			Scanner lector = new Scanner(System.in);
			System.out.println("=======Nuevo Proyecto======");
			System.out.println("Nombre:");
			String nombre = lector.nextLine();
			
			Proyecto p =new Proyecto(nombre);
			if(empleados.isEmpty()) {
				System.out.println("No hay empleados disponibles para asignar");
			}else {
				System.out.println("\n Lista de empleados ");
				
				for (int i = 0; i < empleados.size(); i++) {
					System.out.println(i + ". " + empleados.get(i));
				}
				
				int opcion;
				do{
					System.out.print("Selecciona empleado (-1 para terminar): ");
						opcion = lector.nextInt();

						if (opcion >= 0 && opcion < empleados.size()) {
							p.agregarEmpleado(empleados.get(opcion));
							System.out.println("Empleado añadido al proyecto.");
						} else if (opcion != -1) {
							System.out.println("Índice no válido.");
						}
				}while (opcion != -1);  
			}
			proyectos.add(p);
			System.out.println("Proyecto creado correctamente");
			
		}
		
		public static void anadirTareas() {
			Scanner lector = new Scanner(System.in);
			System.out.println("Escoge un Proyecto:");
			if(proyectos.isEmpty()) {
				System.out.println("No hay ningún proyecto creado al que asignar tareas");
			}else {
				System.out.println("\n Lista de proyectos ");
				
				for (int i = 0; i < proyectos.size(); i++) {
					System.out.println(i + ". " + proyectos.get(i));
				}
			}
			int opcion;
					opcion = lector.nextInt();

					Proyecto proyectoE = null;

					if (opcion >= 0 && opcion < proyectos.size()) {
						Proyecto proyectoE = proyectos.get(opcion);
						System.out.println("Proyecto " + proyectoE.getNombre() + " elegido.");
					} else {
						System.out.println("Índice no válido.");
					}
			String continuar;
		do {
			opcion = lector.nextInt();
			lector.nextLine();
			System.out.println("====Añadir Tarea====");
				System.out.println("Nombre tarea");
				String nombre = lector.nextLine();
				System.out.println("Duracion Horas");
				float horas = lector.nextFloat();
				System.out.println("Nº Personal necesario");
				int personal = lector.nextInt();
				lector.nextLine(); //limpiar lo que habia en el lector
				Tarea nTarea = new Tarea(nombre,horas,personal);

				proyectoE.agregarTarea(nTarea);
	
				System.out.print("¿Añadir otra tarea? (s/n): ");
				continuar = lector.nextLine();
				
		}while (!continuar.equals("n"));
		}
		
		static ArrayList<Empleado> empleados = new ArrayList<>();
		static ArrayList<Proyecto> proyectos = new ArrayList<>();
		
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			int opcion;	
			
			do {
			System.out.println("==== Gestor Proyectos ====\r\n"
								+ "1. Añadir empleado\r\n"
								+ "2. Crear nuevo proyecto\r\n"
								+ "3. Añadir tareas a proyecto\r\n"
								+ "0. Cerrar gestor");
			opcion = lector.nextInt();
		switch(opcion) { 
			case 1:
				anadirEmpleado();
			break;
			case 2:
				nProyecto();
			break;
			
			case 3:
				anadirTareas();
			break;
			
			case 0:
				System.out.println("Apagando...");
			break;
			
			default:
				System.out.println("Por favor escoga una opción del menu");
			break;
		}

		}while(opcion !=0);

	}
	}
