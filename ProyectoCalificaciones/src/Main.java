import escuela.notas.Calificacion;

public class Main {
	
    public static void main(String[] args) {
        // Crear un array de 10 calificaciones
        Calificacion[] calificaciones = new Calificacion[10];
        new lector

        // Inicializar el array con objetos Calificacion
        calificaciones[0] = new Calificacion("Matemáticas", 8.5f);
        calificaciones[1] = new Calificacion("Lengua", 6.2f);
        calificaciones[2] = new Calificacion("Historia", 4.8f);
        calificaciones[3] = new Calificacion("Física", 9.1f);
        calificaciones[4] = new Calificacion("Química", 3.0f);
        calificaciones[5] = new Calificacion("Biología", 7.3f);
        calificaciones[6] = new Calificacion("Inglés", 5.5f);
        calificaciones[7] = new Calificacion("Geografía", 2.5f);
        calificaciones[8] = new Calificacion("Arte", 6.9f);
        calificaciones[9] = new Calificacion("Música", 9.8f);

        // Mostrar las asignaturas y notas en texto
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
	}
}