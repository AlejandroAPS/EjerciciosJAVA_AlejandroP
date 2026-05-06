package gimnasio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Gimnasio implements IGimnasio {

    private String nombre;
    private Map<Integer, Reserva> reservas;
    
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.reservas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Integer, Reserva> getReservas() {
        return reservas;	
    }

    public void setReservas(Map<Integer, Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
    	return null;
    }
    
    /**
	 * añade una reserva, si no se pasa nada, devuelve false
	 * y si ya existe una igual, también devuelve false	
	 */
    @Override
    public boolean addReserva(Reserva reserva) {
        if (reserva == null) return false;

        int id = reserva.getIdReserva();

        if (reservas.containsKey(id)) {
            return false; // ya existe (evita duplicados)
        }

        reservas.put(id, reserva);
        return true;
    }
    
    @Override
    public boolean cancelarReserva(int idReserva) {
        return reservas.remove(idReserva) != null;
    }
    
    /**
	 * Se genera y se devuelve un nuevo Hashmap que hace de copia pare ser enseñado
	 * de aquel que contiene todas las reservas
	 */
    @Override
    public Map<Integer, Reserva> getAllReservas() {
        return new HashMap<>(reservas); 
    }
    
    @Override
    /**
	 * TODOS LOS GET RESERVAS DE LO QUE SEA SON IGUALES
	 * Unicamente cambia el filtro utilizado
	 */
    public Map<Integer, Reserva> getReservasAlumno(String dniAlumno) {
        Map<Integer, Reserva> resultado = new HashMap<>();

        for (Map.Entry<Integer, Reserva> entry : reservas.entrySet()) {
            if (entry.getValue().getAlumno().getDni().equals(dniAlumno)) {
                resultado.put(entry.getKey(), entry.getValue());
            }
        }
        
        return resultado;
    }
    
    @Override
    public Map<Integer, Reserva> getReservasEntrenador(String dniEntrenador) {
        Map<Integer, Reserva> resultado = new HashMap<>();

        for (Map.Entry<Integer, Reserva> entry : reservas.entrySet()) {
            if (entry.getValue().getEntrenador().getDni().equals(dniEntrenador)) {
                resultado.put(entry.getKey(), entry.getValue());
            }
        }

        return resultado;
    }
    
    @Override
    public Map<Integer, Reserva> getReservasPorFecha(LocalDate fecha) {
        Map<Integer, Reserva> resultado = new HashMap<>();

        for (Map.Entry<Integer, Reserva> entry : reservas.entrySet()) {
            if (entry.getValue().getFecha().equals(fecha)) {
                resultado.put(entry.getKey(), entry.getValue());
            }
        }

        return resultado;
    }

    
    @Override
    public boolean existeReserva(int idReserva) {
        return reservas.containsKey(idReserva);
    }
    
}