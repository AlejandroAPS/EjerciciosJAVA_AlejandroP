import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args){
        int numero = 0;
        Scanner lector = new Scanner(System.in);
        for(;numero!=3;) {
            System.out.print("Introduce un número: ");
            numero = lector.nextInt();
        }
        lector.close();

        for(; Math.random() != 0.5;){
            System.out.println("Generando...");;
        }

    }
}
