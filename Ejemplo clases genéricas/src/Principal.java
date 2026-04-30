import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo con Integer
        calculadora<Integer> calcEnteros = new calculadora<>(5, 3);
        System.out.println("Suma de enteros: " + calcEnteros.suma());


        // Ejemplo con Float
        calculadora<Float> calcDecimales = new calculadora<>(2.345f, 1.234f);
        System.out.println("Suma de decimales (redondeado): " + calcDecimales.suma());


        // Ejemplo con String
        calculadora<String> calcCadenas = new calculadora<>("Hola ", "mundo");
        System.out.println("Concatenación de cadenas: " + calcCadenas.suma());
    }
}
