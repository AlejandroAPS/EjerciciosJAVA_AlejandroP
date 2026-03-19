import java.util.Scanner;
import escuela.notas.Calificacion;

public class Main {

    public static void main(String[] args) {

        // Array con espacio de sobra
        Calificacion[] calificaciones = new Calificacion[100];

        // Contador de elementos reales
        int total = 0;

        // Añadir iniciales
        calificaciones[total++] = new Calificacion("Matemáticas", 8.5f);
        calificaciones[total++] = new Calificacion("Lengua", 6.2f);
        calificaciones[total++] = new Calificacion("Historia", 4.8f);
        calificaciones[total++] = new Calificacion("Física", 9.1f);
        calificaciones[total++] = new Calificacion("Química", 3.0f);

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuántas calificaciones quieres añadir?");
        int cantidad = lector.nextInt();
        lector.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Nombre asignatura:");
            String asignatura = lector.nextLine();

            System.out.println("Nota:");
            float nota = lector.nextFloat();
            lector.nextLine();

            // Guardar en la siguiente posición libre
            calificaciones[total++] = new Calificacion(asignatura, nota);
        }

        // Mostrar solo los que existen
        System.out.println("\nCalificaciones:");
        for (int i = 0; i < total; i++) {
            System.out.println(calificaciones[i]);
        }
        
        float suma = 0f;
        for (int i = 0;i < total; i++ ) {
        	suma = suma + calificaciones[i].getNota();        
    	}	
    
        float media = suma/total; 
        System.out.println("Media de todas las notas:" + media);
        
        float notaMax = 0;
        for (int i =0;i < total; i++) {
        	if (notaMax < calificaciones[i].getNota()){
        		notaMax = calificaciones[i].getNota();
        	}
        }
        
        System.out.println("Nota mas alta:" + notaMax);
        
    }
}