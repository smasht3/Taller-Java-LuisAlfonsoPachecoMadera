import java.util.Scanner;

public class cinco {

    private static int i;
    private static int o;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la Droguería Mi Salud");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1: Comprar producto");
        System.out.println("2: Ver precios de los productos");
        System.out.println("3: Devolver producto");

        i = input.nextInt();

        switch (i)
        {
            case 1:
                System.out.println("¿Que quieres comprar?");
                System.out.println("Ofrecemos:");
                System.out.println("1: Acetaminofén x 300$");
                System.out.println("2: Noxpirín x 1300$");
                System.out.println("3: Ibuprofeno x 500$");
                o = input.nextInt();
                switch (o)
                {
                    case 1:
                        System.out.println("Haz comprado Acetaminofén x 300$");
                        break;
                    case 2:
                        System.out.println("Haz comprado Noxpirín x 1300$");
                        break;
                    case 3:
                        System.out.println("Haz comprado Ibuprofeno x 500$");
                        break;
                }
                break;
            case 2:
                System.out.println("Actualmente tenemos los siguientes productos: ");
                System.out.println("Acetaminofén x 300$");
                System.out.println("Noxpirín x 1300$");
                System.out.println("Ibuprofeno x 500$");

                break;
            case 3:
                System.out.println("¿Que quieres devolver?");
                System.out.println("Ofrecemos:");
                System.out.println("1: Acetaminofén");
                System.out.println("2: Noxpirín");
                System.out.println("3: Ibuprofeno");
                o = input.nextInt();
                switch (o)
                {
                    case 1:
                        System.out.println("Haz devuelto Acetaminofén x 300$");
                        break;
                    case 2:
                        System.out.println("Haz devuelto Noxpirín x 1300$");
                        break;
                    case 3:
                        System.out.println("Haz devuelto Ibuprofeno x 500$");
                        break;
                }
                break;
        }

    }

}
