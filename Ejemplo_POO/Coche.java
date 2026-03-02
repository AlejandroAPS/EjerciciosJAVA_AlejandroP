public class Coche {
    //Propiedades (variables del objeto)
    //Dterminan el estado del bojeto
    public String matricula;
    public String marca;
    public String modelo;
    public int velocidad;

    //Métodos (acciones que es capaz de realizar cada objeto)
    // Determina el comportamiento del objeto
    public void acelerar(int cuanto){
        this.velocidad = this.velocidad + cuanto;
    }

    public void frenar(int cuanto){
        this.velocidad = this.velocidad - cuanto;    
    }

    public String estado() {
        return this.marca + " " + this.marca + " " + this.matricula + " va a " + this.velocidad + " km/hora";
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void getMatricula(String matricula){
        this.matricula = matricula;
    }
}


