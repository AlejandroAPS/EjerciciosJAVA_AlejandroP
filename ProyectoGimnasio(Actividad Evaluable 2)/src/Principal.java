import gimnasio.*;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        //Crear gimnasio
        IGimnasio gimnasio = new Gimnasio("Gimnasio Súper");

        //Crear usuarios
        Alumno alumno1 = new Alumno("12345678A", "Juan", "622646561", LocalDate.of(2026, 5, 6));
        Entrenador entrenador1 = new Entrenador("87654321B", "Laura","654625638",LocalDate.of(2026, 3, 1), 35.6);

        //Crear reservas
        Reserva reserva1 = new Reserva(1,entrenador1,alumno1,LocalDate.of(2026, 5, 10));
        Reserva reserva2 = new Reserva(2,entrenador1,alumno1,LocalDate.of(2026, 5, 11));

        //Añadir reservas
        System.out.println("Añadir reserva 1: " + gimnasio.addReserva(reserva1));
        System.out.println("Añadir reserva 2: " + gimnasio.addReserva(reserva2));

        //Intentar duplicada
        System.out.println("Añadir reserva duplicada: " + gimnasio.addReserva(reserva1));

        //Ver todas las reservas
        System.out.println("\nTodas las reservas:");
        System.out.println(gimnasio.getAllReservas());

        //Buscar por alumno
        System.out.println("\nReservas del alumno Juan:");
        System.out.println(gimnasio.getReservasAlumno("12345678A"));

        //Buscar por entrenador
        System.out.println("\nReservas de la entrenadora Laura:");
        System.out.println(gimnasio.getReservasEntrenador("87654321B"));

        //Buscar por fecha
        System.out.println("\nReservas del día 2026-05-10:");
        System.out.println(gimnasio.getReservasPorFecha(LocalDate.of(2026, 5, 10)));

        //Cancelar reserva
        System.out.println("\nCancelar reserva 1: " + gimnasio.cancelarReserva(1));

        //Verificar existencia
        System.out.println("Existe reserva 1: " + gimnasio.existeReserva(1));
    }
}