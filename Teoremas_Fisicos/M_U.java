public class M_U {
    private Numero distancia;
    private Numero tiempo;
    private Numero Xi;
    private Numero velocidad;

    public M_U() {}

    public M_U(Numero distancia, Numero tiempo, Numero Xi, Numero velocidad) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.Xi = Xi;
        this.velocidad = velocidad;
    }

    public Numero getDistancia() {
        return distancia;
    }

    public void setDistancia(Numero distancia) {
        this.distancia = distancia;
    }

    public Numero getTiempo() {
        return tiempo;
    }

    public void setTiempo(Numero tiempo) {
        this.tiempo = tiempo;
    }

    public Numero getXi() {
        return Xi;
    }

    public void setXi(Numero Xi) {
        this.Xi = Xi;
    }

    public Numero getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Numero velocidad) {
        this.velocidad = velocidad;
    }

    // Fórmulas del Movimiento Uniforme

    // Método corregido para calcular la velocidad constante
    public int calcularVelocidadConstante() {
        if (tiempo.getNumero() == 0) {
            System.out.println("El tiempo no puede ser 0.");
            return 0;
        }
        return distancia.getNumero() / tiempo.getNumero();
    }

    // Método corregido para calcular la distancia total
    public int calcularDistanciaTotal() {
        return Xi.getNumero() + velocidad.getNumero() * tiempo.getNumero();
    }

    @Override
    public String toString() {
        // Uso de los métodos corregidos sin necesidad de pasar parámetros
        return "Velocidad constante: " + distancia.getNumero() + " / " + tiempo.getNumero() +
               " = " + calcularVelocidadConstante() + "\n" +
               "Distancia total: " + Xi.getNumero() + " + " + velocidad.getNumero() + " * " +
               tiempo.getNumero() + " = " + calcularDistanciaTotal();
    }
}
