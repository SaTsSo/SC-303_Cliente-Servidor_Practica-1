public abstract class CuerpoCeleste {

    protected String nombre;
    protected double tamano;

    protected CuerpoCeleste(String nombre, double tamano) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (tamano <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser un valor positivo.");
        }
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
        return nombre + " (tamaño: " + tamano + ")";
    }

    protected double raizCuadrada(double numero) {
        double aproximacion = numero;
        for (int i = 0; i < 10; i++) {
            aproximacion = (aproximacion + numero / aproximacion) / 2;
        }
        return aproximacion;
    }
}
