import java.util.Scanner;

public class cuatro {

    private static int i;
    private static int o;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a películas El Porvenir");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1: Rentar película");
        System.out.println("2: Revisar catalogo");
        System.out.println("3: Devolver película");

        i = input.nextInt();

        switch (i)
        {
            case 1:
                System.out.println("Has reclamado la película Mad Max");
                break;
            case 2:
                System.out.println("Actualmente tenemos Mad Max");
                break;
            case 3:
                System.out.println("Haz devuelto Mad Max");
                System.out.println("¿Quieres hacer una anotación?");
                System.out.println("1: no");
                System.out.println("2: si");
                o = input.nextInt();

                switch (o)
                {
                    case 1:
                        System.out.println("Haz devuelto Mad Max sin anotaciones");
                        break;
                    case 2:
                        System.out.println("Escribe tu anotación");
                        String anotacion = sc.nextLine();
                        System.out.println("Haz devuelto Mad Max con la siguiente anotación:");
                        System.out.println(anotacion);
                        break;
                }

                break;
            default:
                System.out.println("Elija bien");
        }

    }

}
