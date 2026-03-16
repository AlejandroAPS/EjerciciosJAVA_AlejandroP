
public class Coche {
	public String matricula;
	public String marca;
	public String modelo;
	public String color;
	public int velocidad;
	public Coche(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public void acelerar(int cuanto) {
        this.velocidad += cuanto;
    }
    
    public void frenar(int cuanto) {
        this.velocidad -= cuanto;
    }

    

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
	        return "Matricula:  " + this.matricula
	        		+ " Marca: " + this.marca 
	        		+ " Modelo: " + this.modelo
	        		+ " Color: " + this.color
	        		+ " Velocidad: " + this.velocidad;
	    }

	
    
}
