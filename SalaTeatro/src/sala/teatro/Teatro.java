package sala.teatro;

import java.util.Arrays;

public class Teatro {
	private String direccion;
	private Cliente[][] butacas;
	private Obra obra;
	
	public Teatro(String direccion, Obra obra) {
		super();
		this.direccion = direccion;
		this.obra = obra;
		this.butacas = new Cliente[5][10];
	}
	public boolean reservarButaca(int fila, int butaca, Cliente cli) {
		
		
		return false;
	}
	
	
	
	
	
	
	

	
	// GETTER AND SETTER ==================================
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente[][] getButacas() {
		return butacas;
	}

	public void setButacas(Cliente[][] butacas) {
		this.butacas = butacas;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}
	//==========================================================
	
	// TO STRINGS DEPENDE DE DISTINTINTAS SITUACIONES
	public String verbutacas() {
		String resultado = "Direccion: " + direccion + "\n";
	    resultado += "Butacas:\n";

	    for (int i = 0; i < butacas.length; i++) {
	        for (int j = 0; j < butacas[i].length; j++) {

	            if (butacas[i][j] == null) {
	                resultado += "[No ocupada] ";
	            } else {
	                resultado += "[" + butacas[i][j].getNombre() + " - " 
	                                   + butacas[i][j].getDni() + "] ";
	            }
	        }
	        resultado += "\n"; // salto de línea por fila
	    }
	    return resultado;
	}
	
	
	public String verLibres() {
	    String resultado = "Direccion: " + direccion + "\n";
	    resultado += "Butacas:\n";
	    
	    for (int i = 0; i < butacas.length; i++) {
	        for (int j = 0; j < butacas[i].length; j++) {

	            if (butacas[i][j] == null) {
	                resultado += "[No ocupada] ";
	            }
	        }
	        resultado += "\n"; // salto de línea por fila
	    }

	    return resultado;
	}
	
	public String verOcupadas()) {
	    String resultado = "Direccion: " + direccion + "\n";
	    resultado += "Butacas:\n";
	    
	    for (int i = 0; i < butacas.length; i++) {
	        for (int j = 0; j < butacas[i].length; j++) {

	            if (butacas[i][j] == null) {
	                //No hace nada lol
	            } else {
	            	resultado += "[" + butacas[i][j].getNombre() + " - " 
                    + butacas[i][j].getDni() + "] "; 
	            }
	        }
	        resultado += "\n"; // salto de línea por fila
	    }

	    return resultado;
	}
	
}
