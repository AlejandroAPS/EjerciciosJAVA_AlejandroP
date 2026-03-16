
public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pepe", "91333221");
		Persona p2 = new Alumno("Alicia", "91333221", 54);
		Persona p3 = new Profesor("Lucas", "91333221", "Matemáticas");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Persona[] equipo = new Persona[4];
		equipo[0] = new Alumno("Rosa", "61775553",54);
		equipo[1] = new Profesor("Rosa", "61775553", "Inglés");
		equipo[2] = new Alumno("Miguel", "61775553",24);
		equipo[3] = new Persona("Pedro", "61775553");
		
		Object[] cosas = new Object[200];
	}

}
