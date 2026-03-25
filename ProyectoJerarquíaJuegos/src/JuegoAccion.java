public class JuegoAccion extends Juego {

    public int numeroMisiones;
    public int numeroEnemigosDerrotados;

    public JuegoAccion(String titulo, String empresa, int puntuacionBase,
                       int numeroMisiones, int numeroEnemigosDerrotados) {
        super(titulo, empresa, puntuacionBase);
        this.numeroMisiones = numeroMisiones;
        this.numeroEnemigosDerrotados = numeroEnemigosDerrotados;
    }

    @Override
    public double calcularPuntuacionFinal() {
        return puntuacionBase + numeroMisiones + (numeroEnemigosDerrotados / 10.0);
    }
}