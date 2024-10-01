import java.text.DecimalFormat;

public class MathFunctions {
    public static void main(String[] args) {
        int x = 16;
        int raiz = (int) Math.sqrt(x); // hay que hacer cast explicito ya que el metodo Math arroja un long
        System.out.println("The square root of " + x + " is " + raiz);

        int potencia = (int) Math.pow(x, 4);
        System.out.println(x + " elevado a la cuarta potencia es: " + potencia);

        double pi =  Math.PI;
        double piRounded = Math.round(pi);
        System.out.println(piRounded);

        // Format de un cierto numero de decimales pero los crea en una variable tipo String
        DecimalFormat df = new DecimalFormat("#.####");
        String piRounded2 = df.format(pi);
        System.out.println(piRounded2);

        /*
            CASTS
         */
        double num1 = 9.997;
        int num2 = (int) num1;
        System.out.println(num2);

        // Si se quiere redondear es preferible usar Math.round

        int num3 = (int) Math.round(num1); // Hay que castear a (int) ya que .round arroja long types
        System.out.println(num3);

        /*
            COMBINACION DE OPERADORES
         */
        num1 += 3; // añade 3 al valor de num1
        System.out.println(num1);
        num1 ++; // añade 1 al valor de num1
        System.out.println(num1);



    }
}
