public class Ejercicio8 {
    
    public static void main(String[] args){
        String cadena = "Hola soy una persona";

        String[] arrayPalabras = cadena.split(" ");
        
        System.out.println(arrayPalabras);
   
        for(String palabra : arrayPalabras){
            System.out.println(palabra);
        }

        System.out.println("Número de palabras: " + arrayPalabras.length);

    }

}
