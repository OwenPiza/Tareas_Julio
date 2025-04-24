public class Vista {

    public void mostrarTitulo() {
        System.out.println("===============================================");
        System.out.println(" PROGRAMA DE CÁLCULOS DE MOVIMIENTOS FÍSICOS ");
        System.out.println(" Incluye M.U., M.U.A., Caída Libre y Movimiento 2D ");
        System.out.println("===============================================\n");
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una opción:\n");
        System.out.println("\t1. Movimiento Uniforme (M.U.)");
        System.out.println("\t2. Movimiento Uniformemente Acelerado (M.U.A)");
        System.out.println("\t3. Caída Libre");
        System.out.println("\t4. Movimiento en 2D");
        System.out.println("\t5. Salir\n");
        leerOpcionEntero();
    }

    public void leerNumeroEntero() {
        System.out.print("\tIngrese un número entero: ");
    }

    public void leerOpcionEntero() {
        System.out.print("\tEscoja la opción: ");
    }

    // Instrucciones
    public void pedirDistanciaYTiempo() {
        System.out.println("\n\t[Movimiento Uniforme] Ingrese la distancia (m): ");
        System.out.println("\tLuego ingrese el tiempo (s): ");
    }

    public void pedirViAyT() {
        System.out.println("\n\t[Movimiento Uniformemente Acelerado] Ingrese velocidad inicial (m/s): ");
        System.out.println("\tLuego aceleración (m/s²): ");
        System.out.println("\tY tiempo (s): ");
    }

    public void pedirViGyT() {
        System.out.println("\n\t[Caída Libre] Ingrese velocidad inicial (m/s): ");
        System.out.println("\tLuego gravedad (m/s²): ");
        System.out.println("\tY tiempo de caída (s): ");
    }

    public void pedirVelocidadAnguloTiempo() {
        System.out.println("\n\t[Movimiento en 2D] Ingrese velocidad inicial (m/s): ");
        System.out.println("\tLuego ángulo de lanzamiento (grados): ");
        System.out.println("\tY tiempo de vuelo (s): ");
    }

    // Fórmulas
    public void mostrarFormulaMU() {
        System.out.println("\n\tFórmula usada: v = d / t");
    }

    public void mostrarFormulaMUA() {
        System.out.println("\n\tFórmula usada: vf = vi + a * t");
    }

    public void mostrarFormulaCaidaLibre() {
        System.out.println("\n\tFórmula usada: vf = vi + g * t");
    }

    public void mostrarFormulaMovimiento2D() {
        System.out.println("\n\tFórmulas usadas:");
        System.out.println("\tX = v * cos(θ) * t");
        System.out.println("\tY = v * sin(θ) * t - (1/2) * g * t²");
    }

    // Resultados detallados
    public void mostrarResultadoMUVelocidad(int d, int t, int resultado) {
        System.out.printf("\n\tv = %d / %d = %d\n\n", d, t, resultado);
    }

    public void mostrarResultadoMUA(int vi, int a, int t, int resultado) {
        System.out.printf("\n\tvf = %d + %d * %d = %d\n\n", vi, a, t, resultado);
    }

    public void mostrarResultadoCaidaLibre(int vi, int g, int t, int resultado) {
        System.out.printf("\n\tvf = %d + %d * %d = %d\n\n", vi, g, t, resultado);
    }

    public void mostrarDefault() {
        System.out.println("\n\tOpción no válida. Escoja entre 1 y 5.\n");
    }

    public void mostrarDespedida() {
        System.out.println("\tGracias por usar el programa. ¡Hasta pronto!\n");
    }

    public void saltarLinea() {
        System.out.println();
    }

    public void mostrarInputMismatchException() {
        System.out.println("\n\tError: Debe ingresar un número entero.\n");
    }
}
