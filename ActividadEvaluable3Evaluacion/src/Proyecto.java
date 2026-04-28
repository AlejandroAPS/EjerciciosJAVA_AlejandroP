import java.util.ArrayList;

public class Proyecto {
	
	private String nombre;
	private ArrayList<Empleado> empleados;
	private ArrayList<Tarea> tareas;
	
	//=========================== GETTERS AND SETTERS ======================
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//======================================================================
	
	
	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
		this.tareas = new ArrayList<>();
	}


	public Proyecto (){
		super();
		this.nombre = "Proyecto";
		this.empleados = new ArrayList<>();
		this.tareas = new ArrayList<>();
	}
	
	  // Métodos para añadir
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
	@Override
	public String toString() {
		return "==" + nombre + "==\r\n"+
				"Empleados:\r\n" + empleados + 
				"\r\n Tareas:" + tareas + "\r\n";
	}
	
}
