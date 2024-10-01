public class VarAndConst {
    /*
        CLASS CONSTANT
        declarada con las keywords static final
     */

    public static final double CM_POR_PULGADA = 2.54;

    public static void main(String[] args) {
        /*
        * VARIABLES
         */
        byte edad = 31;
        String nombre = "Mateo Rendón";
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años."); // Uso de variables declaradas.

        /*
        * CONSTANTES
        * Se usa la plabra final para declarar una constante.
         */
        //final double CM_POR_PULGADA = 2.54;
        System.out.println("10 pulgadas equivalen a: " + 10 * CM_POR_PULGADA + "cm.");


    }
}
