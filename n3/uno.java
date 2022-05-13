public class uno {

    private static int incremento;
    private static int maximo;

    public static void main(String args[]) {

        incremento = 1;
        maximo = 1;
        for (incremento=1;incremento<=11;incremento++) {
            for (incremento=1;incremento<=maximo;incremento++) {
                System.out.print("*");
            }
            System.out.println(" ");
            maximo = maximo+1;
        }
    }

}
