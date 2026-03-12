
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("1234ABC", "Toyota", "Yaris", "Rojo");
        PlazaGaraje plaza1 = new PlazaGaraje(5, 1, "2.5m x 5m");

        System.out.println(plaza1);  // Debería indicar que está vacía
        plaza1.aparca(miCoche);
        System.out.println(plaza1);  // Ahora muestra el coche aparcado
        plaza1.desaparca();
        System.out.println(plaza1);  // De nuevo está vacía
    }
}