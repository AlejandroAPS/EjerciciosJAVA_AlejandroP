package gimnasio;

import java.time.LocalDate;
import java.util.Map;

public interface IGimnasio {

    boolean addReserva(Reserva reserva); //hay que hacer todas estas funciones ya sabes,funcionales

    boolean cancelarReserva(int idReserva);

    Map<Integer, Reserva> getAllReservas();

    Map<Integer, Reserva> getReservasAlumno(String dniAlumno);

    Map<Integer, Reserva> getReservasEntrenador(String dniEntrenador);

    Map<Integer, Reserva> getReservasPorFecha(LocalDate fecha);

    boolean existeReserva(int idReserva);
}