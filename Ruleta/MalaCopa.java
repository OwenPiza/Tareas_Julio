import java.util.Random;

public class MalaCopa extends Personaje {
    private Random rand = new Random();

    @Override
    public String getCasoRojo() {
        return "Mala Copa logró beber sin causar problemas.";
    }

    @Override
    public String getCasoNegro() {
        return "Mala Copa empezó a discutir con todos.";
    }

    @Override
    public String getCasoVerde() {
        if (rand.nextBoolean()) {
            return "Mala Copa ganó un premio por no causar líos.";
        } else {
            return "Mala Copa fue expulsado de la fiesta por mal comportamiento.";
        }
    }
}

