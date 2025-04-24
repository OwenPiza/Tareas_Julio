public class Movimiento2D {
    private Numero velocidad;
    private Numero angulo; // en grados
    private Numero tiempo;

    public Movimiento2D() {}

    public Movimiento2D(Numero velocidad, Numero angulo, Numero tiempo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
        this.tiempo = tiempo;
    }

    public Numero getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Numero velocidad) {
        this.velocidad = velocidad;
    }

    public Numero getAngulo() {
        return angulo;
    }

    public void setAngulo(Numero angulo) {
        this.angulo = angulo;
    }

    public Numero getTiempo() {
        return tiempo;
    }

    public void setTiempo(Numero tiempo) {
        this.tiempo = tiempo;
    }

    // Descomposición de la velocidad
    public double calcularComponenteX() {
        double radianes = Math.toRadians(angulo.getNumero());
        return velocidad.getNumero() * Math.cos(radianes);
    }

    public double calcularComponenteY() {
        double radianes = Math.toRadians(angulo.getNumero());
        return velocidad.getNumero() * Math.sin(radianes);
    }

    // Distancia en X: x = v * cos(angulo) * t
    public double calcularDistanciaX() {
        return calcularComponenteX() * tiempo.getNumero();
    }

    // Distancia en Y: y = v * sin(angulo) * t - (1/2) * g * t^2
    public double calcularDistanciaY(double gravedad) {
        return calcularComponenteY() * tiempo.getNumero() - 0.5 * gravedad * Math.pow(tiempo.getNumero(), 2);
    }

    @Override
    public String toString() {
        return "Componente X: " + calcularComponenteX() + "\n" +
               "Componente Y: " + calcularComponenteY() + "\n" +
               "Distancia en X: " + calcularDistanciaX() + "\n" +
               "Distancia en Y (g=9.8): " + calcularDistanciaY(9.8);
    }
}

