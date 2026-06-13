public class PlanetaRocoso extends CuerpoCeleste implements Planeta {

    private static final double DISTANCIA_TIERRA = 149.6;

    private double distanciaSol;
    private int numeroLunas;

    public PlanetaRocoso(String nombre, double tamano, double distanciaSol, int numeroLunas) {
        super(nombre, tamano);
        if (distanciaSol <= 0) {
            throw new IllegalArgumentException("La distancia al Sol debe ser un valor positivo.");
        }
        if (numeroLunas < 0) {
            throw new IllegalArgumentException("El número de lunas no puede ser negativo.");
        }
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
        double relacionConTierra = distanciaSol / DISTANCIA_TIERRA;
        return relacionConTierra * raizCuadrada(relacionConTierra);
    }

    @Override
    public int compararPorTamano(Planeta otro) {
        if (otro == null) {
            throw new IllegalArgumentException("El planeta a comparar no puede ser nulo.");
        }
        return Double.compare(this.getTamano(), otro.getTamano());
    }

    @Override
    public int compararPorDistancia(Planeta otro) {
        if (otro == null) {
            throw new IllegalArgumentException("El planeta a comparar no puede ser nulo.");
        }
        return Double.compare(this.getDistanciaSol(), otro.getDistanciaSol());
    }

    @Override
    public String toString() {
        return super.toString()
                + ", distancia al Sol: " + distanciaSol + " millones de km"
                + ", lunas: " + numeroLunas
                + ", tipo: " + getTipo();
    }
}
