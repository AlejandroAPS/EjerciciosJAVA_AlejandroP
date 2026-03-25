public class JuegoEstrategia extends Juego {

    public int partidasGanadas;
    public int recursosConstruidos;

    public JuegoEstrategia(String titulo, String empresa, int puntuacionBase,
                           int partidasGanadas, int recursosConstruidos) {
        super(titulo, empresa, puntuacionBase);
        this.partidasGanadas = partidasGanadas;
        this.recursosConstruidos = recursosConstruidos;
    }

    @Override
    public double calcularPuntuacionFinal() {
        return puntuacionBase + (partidasGanadas * 2) + (recursosConstruidos / 5.0);
    }
}