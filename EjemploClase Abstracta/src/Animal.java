public abstract class Animal {
    // Variable de instancia de clase.
    String nombre;

    // Constructor.
    Animal(String n) {
        this.nombre = n;
    }

    // Métodos abstractos, deben ser implementados
    // en una clase derivada.
    

    // Método no abstracto, podrá ser o no implementado
    // en la clase derivada.
    public String toString() {
        return "Saludos desde Animal";
    }

	public String getNombre() {
		return nombre;
	}
	
	
	//Métodos abstractos
	//Se implementan en las clases derivadas
	public abstract String morder(Animal ani);
    public abstract String mover();
    
    
}