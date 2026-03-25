public class JuegoDeporte extends Juego {

    public int partidosGanados;
    public int golesMarcados;

    public JuegoDeporte(String titulo, String empresa, int puntuacionBase,
                        int partidosGanados, int golesMarcados) {
        super(titulo, empresa, puntuacionBase);
        this.partidosGanados = partidosGanados;
        this.golesMarcados = golesMarcados;
    }

    @Override
    public double calcularPuntuacionFinal() {
        return puntuacionBase + (partidosGanados * 3) + (golesMarcados / 2.0);
    }
}