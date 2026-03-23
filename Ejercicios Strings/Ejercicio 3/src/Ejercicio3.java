public class Ejercicio3{


    public static void main(String[] args) {
        String cadena = "hola soy una persona, hola";
        String palabra = "persona";
        String palabra2 = "hola";
        int primera = cadena.indexOf(palabra2);
        int ultima  = cadena.lastIndexOf(palabra2);


        if (cadena.contains(palabra)){
            System.out.println("El String contiene la palabra " + palabra);
        }
        else{
            System.out.println("El String NO contiene la palabra" + palabra);
        }

        System.out.println("La palabra " + palabra2 + " aparece en la posición " + primera + " por primera vez");
        System.out.println("La palabra " + palabra2 + " aparece en la posición " + ultima + " por ultima vez vez");
    }
}