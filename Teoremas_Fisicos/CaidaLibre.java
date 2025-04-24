public class CaidaLibre {
    private Numero velocidadInicial;
    private Numero gravedad;
    private Numero tiempo;
    private Numero velocidadFinal;
    private Numero altura;

    public CaidaLibre() {}

    public CaidaLibre(Numero velocidadInicial, Numero gravedad, Numero tiempo, Numero velocidadFinal, Numero altura) {
        this.velocidadInicial = velocidadInicial;
        this.gravedad = gravedad;
        this.tiempo = tiempo;
        this.velocidadFinal = velocidadFinal;
        this.altura = altura;
    }

    public Numero getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(Numero velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public Numero getGravedad() {
        return gravedad;
    }

    public void setGravedad(Numero gravedad) {
        this.gravedad = gravedad;
    }

    public Numero getTiempo() {
        return tiempo;
    }

    public void setTiempo(Numero tiempo) {
        this.tiempo = tiempo;
    }

    public Numero getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(Numero velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    public Numero getAltura() {
        return altura;
    }

    public void setAltura(Numero altura) {
        this.altura = altura;
    }

    // Fórmulas de caída libre

    // vf = vi + g * t
    public int calcularVelocidadFinal() {
        return velocidadInicial.getNumero() + gravedad.getNumero() * tiempo.getNumero();
    }

    // h = vi * t + (g * t^2) / 2
    public int calcularAltura() {
        return velocidadInicial.getNumero() * tiempo.getNumero()
               + (gravedad.getNumero() * (int)Math.pow(tiempo.getNumero(), 2)) / 2;
    }

    @Override
    public String toString() {
        return "Velocidad final: " + velocidadInicial.getNumero() + " + " + gravedad.getNumero() + " * " +
               tiempo.getNumero() + " = " + calcularVelocidadFinal() + "\n" +
               "Altura: " + velocidadInicial.getNumero() + " * " + tiempo.getNumero() + " + (" +
               gravedad.getNumero() + " * " + tiempo.getNumero() + "^2) / 2 = " + calcularAltura();
    }
}
