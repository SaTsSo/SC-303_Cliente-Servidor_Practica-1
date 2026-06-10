public abstract class CuerpoCeleste {

    protected String nombre;
    protected double tamano;

    protected CuerpoCeleste(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return nombre + " (radio: " + String.format("%.0f", tamano) + " km)";
    }
}
