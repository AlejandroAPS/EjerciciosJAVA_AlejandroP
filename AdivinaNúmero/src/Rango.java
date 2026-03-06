import java.util.Scanner;

public class Rango {
    public int rango;

    public Rango(int rango) {
        this.rango = rango;
    }

    public int numRand() {
        return (int) (Math.random() * this.rango) + 1;
    }

    public static void main(String[] args) {
        Rango miRango = new Rango(20);
        int aleatorio = miRango.numRand();
        int intentos = 0;
        Scanner lector = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.println("Adivina el número o escribe 'fin' para terminar");
            opcion = lector.nextLine();

            if (opcion.equals("fin")) {
                System.out.println("Hasta luego");
                break;
            }

            int numero = Integer.parseInt(opcion);

            if (numero > aleatorio) {
                System.out.println("Mi número es más bajo");
                intentos = intentos + 1;
            } else if (numero < aleatorio) {
                System.out.println("Mi número es más alto");
                intentos = intentos + 1;
            } else {
                System.out.println("¡HAS GANADO!");
                System.out.println("Intentos realizados:" + intentos);
                intentos = 0; //Se reinician el conteo de intento y el numero aleatorio 
                aleatorio = miRango.numRand();
            }

        } while (!opcion.equals("fin"));

        lector.close();
    }
}