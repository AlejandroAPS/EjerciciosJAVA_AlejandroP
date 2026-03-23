import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);  

        System.out.println("Porfavor introduzca una cadena de texto con la que trabajar: ");
        String cadena = scan.nextLine();

        System.out.println("Has introducido: " + cadena);

        int caracteres = cadena.length();
        System.out.println("Tu cadena contiene: " + caracteres +" caracteres.");

        char primercar = cadena.charAt(0);
        char ultimocar = cadena.charAt(cadena.length() - 1);
        
        System.out.println("El primer carácter del texto es: " + primercar);
        System.out.println("El último carácter del texto es: " + ultimocar);

        boolean tieneNum = false;

        for (int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)){
                tieneNum = true;
                break;
            }
        }
        
        if (tieneNum == true){
            System.out.println("La cadena proporcionada tiene por lo menos ún numero");
        }else{
            System.out.println("La cadena proporcionada NO tiene un número");
        }

        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
                inversa += cadena.charAt(i);
        }

        System.out.println("La cadena invertida es: " + inversa);


        if (ultimocar == 'o'){
            System.out.println("El último carácter del string es una o");
        }else{
            System.out.println("El útlimo carácter del string NO es una o");
        }
    }
}
