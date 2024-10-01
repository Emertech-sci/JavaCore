public class DatosPrimitivos {
    /**
     * Vamos a ver los tipos de datos que hay en Java
     * 1- int values:
     *  • byte (1 byte)
     *  • short (2 bytes)
     *  • int (4 bytes)
     *  • long (8 bytes)
     * 2- float values:
     *  • float (4 bytes)
     *  • double (8 bytes)
     * 3- character
     * 4- boolean type (true, false)
     */

    /*
        INT TYPES
     */
    public static void main(String[] args) {
        byte num1 = 2 * 23;
        short num2 = 34;
        int num3 = 34;
        long num4 = 34_334;

        //casteo
        // byte sum1 = num1 + num2; (tenemos un error de casteo pues almacenamos un dato de 2 bytes en uno de 1 byte.
        int sum1 = num1 + num2; // si se almacena un tipo de datos con mayor capacidad de bytes la variable funciona.
        System.out.println(sum1);

        int sum2 = num3 + num3;
        System.out.println(sum2);

        //int sum3 = num3 + num4;  error al querer castear un dato long (8 bytes) en un tipo int (4 bytes)
        // Si lo almacenamos en una variable de tipo long la suma funcioanra.
        long sum3 = num3 + num4;
        System.out.println(sum3);

        if(Double.isNaN(num1)) {
            System.out.println("is Not a Number");
        }else{
            System.out.println("is a Number");
        }

    /*
        FLOAT TYPES (DECIMAL NUMBERS)
     */
    float num5 = 234.34F;
    double num6 = 5_435.3522;

    //casteo
        double sum4 = num5 + num6;
        System.out.println(sum4);

        float sum5 = num4 - num5; // podmeos hacer operaciones entre cualquier tipo de numero int y almacenarlo en un float.
        System.out.println(sum5);

        // casteo
        int suma = (short) num1 + num2;
        System.out.println(suma);

        /*
            CHAR TYPES
         */
            char letra = 'A';
            System.out.println(letra);
            char letra2 = '\u2122';
            System.out.println(letra2);

        /*
            BOOLEAN TYPES
        */
        boolean verdad = true;
        System.out.println(verdad);

    }
}
