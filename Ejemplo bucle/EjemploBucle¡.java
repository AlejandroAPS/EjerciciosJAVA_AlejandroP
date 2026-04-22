

public class EjemploBucle {
    
    public static void main(string[] args){
        int contador = 0;
        while (contador <5){
            contador++;
            System.out.println(contador+" ");
        }

        System.out.println("");
        contador=0;
        do{
            contador++;
            System.out.println(contador+"");
        } while(contador < 5);

        System.out.println("");
        for(contador=1; contador<=5; contador++){
            System.out.println(contador+" ");
        }
    }
}
