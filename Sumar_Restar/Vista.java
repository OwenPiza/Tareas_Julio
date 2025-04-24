public class Vista{
   
    public void mostrarTitulo(){
        System.out.println("==================================="); // informacionpor consola
        System.out.println("Programa para sumar dos enteros "); // informacion porconsola
        System.out.println("y dar el resultado por consola "); // informacion por consola
        System.out.println("==================================="); // informacionpor consola
        System.out.println();
    }

    public void mostrarMenu() {
        System.out.println("");
        System.out.println("\t1. Sumar dos Enteros");
        System.out.println("\t2. Restar dos Enteros");
        System.out.println("\t3. Salir\n\n");
      leerOpcionEntero();
    }

    public void leerNumeroEntero() {
        System.out.println("");
        System.out.print("\tEscriba el número entero: ");
    }

    public void leerOpcionEntero() {
        System.out.println("");
        System.out.print("\tEscoga la opción: ");
    }

    public void mostrarResultadoS(int numero1, int numero2, int resultado) {
        System.out.println("");
        System.out.printf("\t%d + %d = %d \n",numero1, numero2, resultado);
        System.out.println("");
    }

    public void mostrarResultadoR(int numero1, int numero2, int resultado) {
        System.out.println("");
        System.out.printf("\t%d -%d = %d \n",numero1, numero2, resultado);
        System.out.println("");
    }

    public void mostrarDefault() {
        System.out.println("");
        System.out.println("\tSolo números entre 1 y 3\n");
        System.out.println("");
    }

    public void mostrarDespedida(){
        System.out.println("\tJCT, agradece el uso de Software");
        System.out.println("\tRegresa pronto ");
        System.out.println("");
    }

    public void saltarLinea() {
        System.out.println("");
    }

    public void mostrarInputMismatchException() {
        System.out.println("\n\tDebe DIGITAR un número Entero\n");
        System.out.println("");
    } 

}