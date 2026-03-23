public class Ejercicio9 {
    public static void main(String[] args){
        String cadena = "Hola soy una persona";
        char caracter = 0;
        int contadorVocal = 0;
        int contadorEspacios = 0;

        for (int i = 0; i < cadena.length(); i++){
            caracter = Character.toLowerCase(cadena.charAt(i));
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contadorVocal++;
            }else if (caracter == ' '){
                contadorEspacios++;
            }
        }

        System.out.println("La cadena otorgada tiene: " + contadorVocal + " vocales");
        System.out.println("La cadena otorgada tiene " + contadorEspacios + " espacios");

    }
}
