import java.util.ArrayList;

public class Proyecto {
	
	public String nombre;
	public int numEmpleados;
	private ArrayList<Empleado> empleados;
	private ArrayList<Tarea> tareas;
	
	//=========================== GETTERS AND SETTERS ======================
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		empleados = empleados;
	}
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(ArrayList<Tarea> tareas) {
		tareas = tareas;
	}
	//======================================================================
	
	public Proyecto(String nombre, int nºEmpleados, ArrayList<Empleado> empleados, ArrayList<Tarea> tareas) {
		super();
		this.nombre = nombre;
		numEmpleados = nºEmpleados;
		empleados = empleados;
		tareas = tareas;
	}
	
	  // Métodos para añadir
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProfesor(Tarea tarea) {
        tareas.add(tarea);
    }
	
}
