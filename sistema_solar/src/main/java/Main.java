import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Instanciar planetas
        Planeta mercurio = new PlanetaRocoso("Mercurio", 4.879, 57.9, 0);
        Planeta venus = new PlanetaRocoso("Venus", 12.104, 108.2, 0);
        Planeta tierra = new PlanetaRocoso("Tierra", 12.742, 149.6, 1);
        Planeta marte = new PlanetaRocoso("Marte", 6.779, 227.9, 2);
        Planeta jupiter = new PlanetaGaseoso("Júpiter", 139.82, 778.5, 95);
        Planeta saturno = new PlanetaGaseoso("Saturno", 116.46, 1434, 146);
        Planeta urano = new PlanetaGaseoso("Urano", 50.724, 2871, 27);
        Planeta neptuno = new PlanetaGaseoso("Neptuno", 49.244, 4495, 16);

        // Crear lista de planetas
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(mercurio);
        planetas.add(venus);
        planetas.add(tierra);
        planetas.add(marte);
        planetas.add(jupiter);
        planetas.add(saturno);
        planetas.add(urano);
        planetas.add(neptuno);

        // Imprimir los detalles de los planetas
        for (Planeta planeta : planetas) {
            System.out.println(planeta.toString());
        }
    }
}