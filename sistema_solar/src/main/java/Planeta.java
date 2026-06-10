public interface Planeta {

    String getNombre();

    double getTamano();

    double getDistanciaSol();

    int getNumeroLunas();

    String getTipo();

    double calcularAnio();

    int compararPorTamano(Planeta otro);

    int compararPorDistancia(Planeta otro);
}
