import java.util.Random;

public class Ladron extends Personaje {
    private Random rand = new Random();

    @Override
    public String getCasoRojo() {
        return "El ladrón fue atrapado robando y expulsado de la fiesta.";
    }

    @Override
    public String getCasoNegro() {
        return "El ladrón robó varios celulares sin ser visto.";
    }

    @Override
    public String getCasoVerde() {
        if (rand.nextBoolean()) {
            return "El ladrón se fue con toda la plata de la fiesta.";
        } else {
            return "Lo atraparon y lo metieron preso.";
        }
    }
}
