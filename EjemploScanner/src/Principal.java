import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Principal {


	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("texto.txt");
		if (fichero.exists()) {
			System.out.println("Existe el fichero");
		} else {
			System.out.println("No existe el fichero");
		}
		
		System.out.println("Bytes que ocupa: "+fichero.length());
		Scanner lector = new Scanner(fichero);
		
		lector.useDelimiter(";");
		while (lector.hasNextLine()) {
			String subcadena = lector.nextLine();
			String campos[] = subcadena.split(";");
			String producto = campos[0];
			float precio = Float.parseFloat(campos[1]);
			int stock = Integer.parseInt(campos[2]);
			System.out.println("Producto: "+producto);
			System.out.println("Precio: "+precio);
			System.out.println("Stock: "+stock);
			System.out.println("--------------------------------------");
		}
		lector.close();
		
	}


}

