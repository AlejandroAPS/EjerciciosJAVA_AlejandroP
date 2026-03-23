public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = "hola soy una persona, hola";
        String cadena2 = "hola soy una persona, hola";

        //  Se revisa que sea igual pero es muy delicado
        if (cadena.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales");
        }
        else {
            System.out.println("Las dos cadenas son distintas");
        }

        //Se revisa si son iguales independientemente de mayusculas y minusuculas
        if (cadena.equalsIgnoreCase(cadena2)) {
            System.out.println("Las dos cadenas son iguales");
        }
        else {
            System.out.println("Las dos cadenas son distintas");
        }

        //Se revisa si son iguales van antes o despues lexicograficamente
        int resultado = cadena.compareTo(cadena2);

        if (resultado == 0) {
            System.out.println("Son iguales ambas cadenas");
        } else if (resultado < 0) {
            System.out.println("La primera cadena va antes lexicográficamente que la segunda cadena");
        } else {
            System.out.println("La primera cadena va después lexicográficamente que la segunda cadena");
        }
    }
}

