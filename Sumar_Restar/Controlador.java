import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {
    // crea objeto Scanner para obtener la entrada de la ventana de comandos

    private static Scanner teclado = new Scanner(System.in);
    private Suma suma = new Suma();
    private Resta resta = new Resta();
    private Vista vista = new Vista();
    Modelo  modelo = new Modelo();


    public Controlador(Modelo modelo, Vista vista) {

            this.modelo = modelo;
            this.vista = vista;

}
    public void iniciar() {
        //definir objetos numeros
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        //definir objeto suma
       // Suma suma = new Suma();
        //definir objeto Resta
       // Resta resta = new Resta();
        //definir objeto vista
        Vista vista = new Vista();
        //crear objetos Lectura
        LecturaEntero lectura = new LecturaEntero();
        //definir variables locales
        boolean salir = false;
        int opcion; //Guardar la opcion del usuario
        //mostrar titulo
        vista.mostrarTitulo();
        while(!salir){
            //mostrar menu
            vista.mostrarMenu();
            try {
                opcion = lectura.leerNumero();
                switch(opcion){
                    case 1:
                    //leer numero primer numero
                    int num1 = lectura.leerNumero();
                    numero1.setNumero(num1);
                    //leer numero segundo numero
                    int num2 = lectura.leerNumero();
                    numero2.setNumero(num2);
                    //Se realza la suma
                    int s = suma.sumar( numero1, numero2);
                    //Muestra el resultado
                    vista.mostrarResultadoS( numero1.getNumero(), numero2.getNumero(), s);
                    break;
                    case 2:
                    //leer numero primer numero
                    int num3 = lectura.leerNumero();
                    numero1.setNumero(num3);
                    //leer numero segundo numero
                    int num4 = lectura.leerNumero();
                    numero2.setNumero(num4);
                    //Se realza la suma
                    int r = resta.restar(numero1, numero2);
                    //Muestra el resultado
                    vista.mostrarResultadoR( numero1.getNumero(), numero2.getNumero(), r);
                    break;
                    case 3:
                    salir=true;
                    vista.saltarLinea();
                    vista.mostrarDespedida();
                    vista.saltarLinea();
                    break;
                    default:
                    vista.mostrarDefault();
                }//fin del switch
            } catch (InputMismatchException e) {
                vista.mostrarInputMismatchException();
                teclado.next();
            }
        }//fin del while
        teclado.close();
    }//fin del iniciar
} //fin del Controlador
