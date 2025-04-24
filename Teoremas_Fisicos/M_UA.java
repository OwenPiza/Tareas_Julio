public class M_UA {
    private Numero velocidadInicial;
    private Numero aceleracion;
    private Numero tiempo;
    private Numero velocidadFinal;
    private Numero distancia;

    public M_UA() {}

    public M_UA(Numero velocidadInicial, Numero aceleracion, Numero tiempo, Numero velocidadFinal, Numero distancia) {
        this.velocidadInicial = velocidadInicial;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
        this.velocidadFinal = velocidadFinal;
        this.distancia = distancia;
    }

    public Numero getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(Numero velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public Numero getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Numero aceleracion) {
        this.aceleracion = aceleracion;
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

    public Numero getDistancia() {
        return distancia;
    }

    public void setDistancia(Numero distancia) {
        this.distancia = distancia;
    }

    // Fórmulas del Movimiento Uniformemente Acelerado

    // Fórmula para calcular la velocidad final
    public int calcularVelocidadFinal() {
        return velocidadInicial.getNumero() + aceleracion.getNumero() * tiempo.getNumero();
    }

    // Fórmula para calcular la distancia
    public int calcularDistancia() {
        return velocidadInicial.getNumero() * tiempo.getNumero() + (aceleracion.getNumero() * (int)Math.pow(tiempo.getNumero(), 2)) / 2;
    }

    @Override
    public String toString() {
        // Uso de los métodos corregidos sin necesidad de pasar parámetros
        return "Velocidad final: " + velocidadInicial.getNumero() + " + " + aceleracion.getNumero() + " * " +
               tiempo.getNumero() + " = " + calcularVelocidadFinal() + "\n" +
               "Distancia: " + velocidadInicial.getNumero() + " * " + tiempo.getNumero() + " + (" +
               aceleracion.getNumero() + " * " + tiempo.getNumero() + "^2) / 2 = " + calcularDistancia();
    }
}
