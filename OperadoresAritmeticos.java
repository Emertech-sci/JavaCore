public class OperadoresAritmeticos {
    public static void main(String[] args){
        int num1 = 324;
        double num2 = 73.67;

        // SUMA
        double suma = num1 + num2;
        System.out.println(suma);

        //RESTA
        double resta = num1 - num2;
        System.out.println(resta);

        //DIVISION
        double division = num1 / num2;
        System.out.println(division);

        //MULTIPLICACION
        double  multiplicacion = num1 * num2;
        System.out.println(multiplicacion);

        int num3 = 24;
        int num4 = 3;

        //MODULO
        int modulo = num3 % num4;
        System.out.println(modulo);

        int op = 25 % num4;
        System.out.println(op);

        /*
        int indeterm = 123 /0;
        System.out.println(indeterm);
        La division entre 0 arroja una Exception.
         */
    }
}
