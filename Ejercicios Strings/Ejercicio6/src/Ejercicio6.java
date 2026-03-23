public class Ejercicio6 {
    
    public static void main(String[] args) {
        String cadena = "Hola Soy Una Persona";
        
        String mayuscula = cadena.toUpperCase();
        String minuscula = cadena.toLowerCase();
        String sEspacios =  cadena.replace(" ", "");

        System.out.println("Cadena en mayuscula: " + mayuscula);
        System.out.println("Cadena en minuscula: "+ minuscula);
        System.out.println("Cadena sin espacios: " + sEspacios);
    }
}
