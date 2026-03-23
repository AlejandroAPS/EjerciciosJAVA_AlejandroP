public class Ejercicio7 {
    
    public static void main(String[] args){
        String cadena = "Hola soy una persona";

        String maquina = cadena.replace("persona", "máquina");
        String vocalE = cadena.replace("a", "e");
        String adios = cadena.replaceFirst("Hola", "Adios");

        System.out.println(maquina);
        System.out.println(vocalE);
        System.out.println(adios);

    }

}
