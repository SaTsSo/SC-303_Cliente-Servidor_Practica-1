public class PlanetaRocoso extends CuerpoCeleste implements Planeta {

    private static final double KM_POR_AU = 149_597_870.7;

    private double distanciaSol;
    private int numeroLunas;

    public PlanetaRocoso(String nombre, double tamano, double distanciaSol, int numeroLunas) {
        super(nombre, tamano);
        this.distanciaSol = distanciaSol;
        this.numeroLunas = numeroLunas;
    }

    @Override
    public double getDistanciaSol() {
        return distanciaSol;
    }

    @Override
    public int getNumeroLunas() {
        return numeroLunas;
    }

    @Override
    public String getTipo() {
        return "ROCOSO";
    }

    @Override
    public double calcularAnio() {
        double distanciaEnAU = distanciaSol / KM_POR_AU;
        return Math.pow(distanciaEnAU, 1.5);
    }

    @Override
    public int compararPorTamano(Planeta otro) {
        return Double.compare(this.getTamano(), otro.getTamano());
    }

    @Override
    public int compararPorDistancia(Planeta otro) {
        return Double.compare(this.getDistanciaSol(), otro.getDistanciaSol());
    }

    @Override
    public String toString() {
        return super.toString()
                + ", distancia al Sol: " + String.format("%.0f", distanciaSol) + " km"
                + ", lunas: " + numeroLunas
                + ", tipo: " + getTipo();
    }
}
