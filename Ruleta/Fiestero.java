import java.util.Random;

public class Fiestero extends Personaje {
    private Random rand = new Random();

    @Override
    public String getCasoRojo() {
        return "El Fiestero ganó y organizó la mejor fiesta de la ciudad.";
    }

    @Override
    public String getCasoNegro() {
        return "El Fiestero se quedó sin energía y no apareció a la fiesta.";
    }

    @Override
    public String getCasoVerde() {
        if (rand.nextBoolean()) {
            return "El Fiestero fue coronado rey de la fiesta.";
        } else {
            return "El Fiestero perdió sus cosas en la fiesta y se arrepintió.";
        }
    }
}


