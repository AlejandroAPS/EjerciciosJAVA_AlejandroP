import javax.annotation.processing.SupportedSourceVersion;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Así esta pbsoleto y lo marca tachado
		Integer numero = new Integer(10);
		Double decimal = new Double(3.14);
		Character letra = new Character("A");
		*/
		
		
		Integer numero = Integer.valueOf(10);
		Double decimal = Double.valueOf(3.14);
		Character letra = Character.valueOf('A');
		Integer.valueOf(10);
		
		Integer numero = 10;
		Double decimal = 3.14;
		Character letra = 'A';
		
		Integer a = 10;
		int b = a;
		
		System.out.println("MINIMO INTEGER: " + Integer.MIN_VALUE);
		System.out.println("MAXIMO INTEGER: " + Integer.MAX_VALUE);
		System.out.println("MINIMO BYTE: " + Byte.MIN_VALUE);
		System.out.println("MAXIMO BYTE: " + Byte.MAX_VALUE);
		System.out.println("MINIMO CHARACTER: " +(int) Character.MIN_VALUE);
		System.out.println("MAXIMO CHARACTER: " +(int) Character.MAX_VALUE);
		
		char l = 'A';
		System.out.println(l);
		System.out.println((int)l);

		
	}

}
