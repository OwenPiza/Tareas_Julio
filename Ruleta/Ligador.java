import java.util.Random;

public class Ligador extends Personaje {
    private Random rand = new Random();

    @Override
    public String getCasoRojo() {
        return "Ligador consiguió que alguien lo besara.";
    }

    @Override
    public String getCasoNegro() {
        return "Ligador fue rechazado varias veces.";
    }

    @Override
    public String getCasoVerde() {
        if (rand.nextBoolean()) {
            return "Ligador se convirtió en leyenda de la fiesta.";
        } else {
            return "Ligador terminó solo y triste.";
        }
    }
}


