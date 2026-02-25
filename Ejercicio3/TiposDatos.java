public class TiposDatos{
    //Inicio de la clase main
    public static void main(String args[]) {

        //Se devuelven todos los resultados de las respectivas operaciones
        System.out.println("El resultado de hacer 5/2 es: "+5/2);
        System.out.println("El resultado de hacer 5/2.0 es: "+5/2.0);
        System.out.println("El resultado de hacer 5.0/2 es: "+5.0/2);
        System.out.println("El resultado de hacer 5+2.5 es: "+5+2.5);
        //Se setean las variables a y b
        int a = 10;
        int b = 3;
        
        //Se devuelven los resultados de las operaciones con a y b
        System.out.println("El resultado de hacer 5/2 es: "+a/b);
        System.out.println("El resultado de hacer 5/2 es: "+(double)a/b);

        float x = 3.14f;
        //EL ERROR DE COMPILACIÓN SUCEDE PORQUE SE DEBE DE INDICAR QUE ES FLOAT PONIENDO LA F AL FINAL
    }
}
