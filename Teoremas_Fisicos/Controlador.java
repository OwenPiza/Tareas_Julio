import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {
    private static Scanner teclado = new Scanner(System.in);
    private Vista vista = new Vista();
    private Modelo modelo;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        M_U m_u = modelo.getM_u();
        M_UA m_ua = modelo.getM_ua();
        CaidaLibre caidaLibre = modelo.getCaidaLibre();
        Movimiento2D movimiento2d = modelo.getMovimiento2d();

        LecturaEntero lectura = new LecturaEntero();

        boolean salir = false;
        int opcion;

        vista.mostrarTitulo();

        while (!salir) {
            vista.mostrarMenu();
            try {
                opcion = lectura.leerNumero();
                switch (opcion) {
                    case 1: // M.U.
                    vista.pedirDistanciaYTiempo();
                    int distancia = lectura.leerNumero();
                    int tiempo = lectura.leerNumero();
                    m_u.setDistancia(new Numero(distancia));
                    m_u.setTiempo(new Numero(tiempo));
                    vista.mostrarFormulaMU();
                    vista.mostrarResultadoMUVelocidad(distancia, tiempo, m_u.calcularVelocidadConstante());
                    break;
                
                case 2: // M.U.A.
                    vista.pedirViAyT();
                    int vi = lectura.leerNumero();
                    int a = lectura.leerNumero();
                    int t = lectura.leerNumero();
                    m_ua.setVelocidadInicial(new Numero(vi));
                    m_ua.setAceleracion(new Numero(a));
                    m_ua.setTiempo(new Numero(t));
                    vista.mostrarFormulaMUA();
                    vista.mostrarResultadoMUA(vi, a, t, m_ua.calcularVelocidadFinal());
                    break;
                
                case 3: // Caída Libre
                    vista.pedirViGyT();
                    int viCaida = lectura.leerNumero();
                    int g = lectura.leerNumero();
                    int tCaida = lectura.leerNumero();
                    caidaLibre.setVelocidadInicial(new Numero(viCaida));
                    caidaLibre.setGravedad(new Numero(g));
                    caidaLibre.setTiempo(new Numero(tCaida));
                    vista.mostrarFormulaCaidaLibre();
                    vista.mostrarResultadoCaidaLibre(viCaida, g, tCaida, caidaLibre.calcularVelocidadFinal());
                    break;
                
                case 4: // Movimiento 2D
                    vista.pedirVelocidadAnguloTiempo();
                    int v = lectura.leerNumero();
                    int angulo = lectura.leerNumero();
                    int tiempo2D = lectura.leerNumero();
                    movimiento2d.setVelocidad(new Numero(v));
                    movimiento2d.setAngulo(new Numero(angulo));
                    movimiento2d.setTiempo(new Numero(tiempo2D));
                    vista.mostrarFormulaMovimiento2D();
                    System.out.println(movimiento2d);
                    break;
                
                    case 5:
                        salir = true;
                        vista.saltarLinea();
                        vista.mostrarDespedida();
                        vista.saltarLinea();
                        break;

                    default:
                        vista.mostrarDefault();
                }
            } catch (InputMismatchException e) {
                vista.mostrarInputMismatchException();
                teclado.next();
            }
        }
        teclado.close();
    }
}
