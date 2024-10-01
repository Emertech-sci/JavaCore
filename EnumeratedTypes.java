public class EnumeratedTypes {
    /*
    * Podmeos definir nuestros typos de datos enumerados
     */
    public static void main(String[] args){
        enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
        Size m = Size.MEDIUM;
        System.out.println(m);
        // Lo veremos mas adelante en el capitulo 5.
    }
}
