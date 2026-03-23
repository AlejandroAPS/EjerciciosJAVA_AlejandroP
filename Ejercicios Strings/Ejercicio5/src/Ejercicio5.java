public class Ejercicio5 {
    
    public static void main(String[] args) {
        String cadena = "hola soy una persona";
        
        String primeros5 = cadena.substring(0,4);
        String de3a8 = cadena.substring(2,7);
        String dexaFinal = cadena.substring(2);

        System.out.println("Hasta el carácter 5: " + primeros5);
        System.out.println("Entre el 3 y el 8 " + de3a8);
        System.out.println("Del tercero al final " + dexaFinal);
        
    }   
}
