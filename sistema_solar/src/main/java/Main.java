import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Instanciar planetas
        Planeta mercurio = new PlanetaRocoso("Mercurio", 4.879, 57.9, 0);
        Planeta venus = new PlanetaRocoso("Venus", 12.104, 108.2, 0);

        //Crear lista de planetas
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(mercurio);
        planetas.add(venus);

        //Imprimir los detalles de los planetas
        for (Planeta planeta : planetas){
            System.out.println(planeta.toString());
        }
    }
}