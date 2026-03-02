public class UsoCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.matricula = "1234ABC";
        miCoche.marca = "TOYOTA";
        miCoche.modelo = "YARIS";


        miCoche.acelerar(100);
        miCoche.frenar(25);
        System.out.println(miCoche.matricula + " " + miCoche.marca + " " + miCoche.modelo);
        System.out.println("velocidad "+ miCoche.velocidad);
        System.out.println(miCoche.estado());

    }    
}
