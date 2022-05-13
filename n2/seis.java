import java.util.Scanner;

public class seis {


    private static int entradah;
    private static int entradam;
    private static int salidah;
    private static int salidam;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a el taller de motos El Maquinista");
        System.out.println("Escribe tu hora de ingreso (24)");
        entradah = input.nextInt();
        System.out.println("Escribe tu minuto de ingreso (60)");
        entradam = input.nextInt();

        System.out.println("¿Hay algo malo con tu moto? cuéntanos:");
        String observaciones = sc.nextLine();

        System.out.println("¿Que cosas ha gastado el mecanico en la reparación de su moto?");
        String novedades = sc.nextLine();

        System.out.println("¿Que cosas ha arreglado el mecánico?");
        String arreglos = sc.nextLine();

        System.out.println("Tu problema con que: " + observaciones + " ha sido solucionado");

        System.out.println("Escribe tu hora de salida (24)");
        salidah = input.nextInt();
        System.out.println("Escribe tu minuto de salida (60)");
        salidam = input.nextInt();

        System.out.println("Usted ha entrado a las " +  entradah + ":" + entradam + " con un problema de " + observaciones);
        System.out.println("tras el mecánico utilizar " + novedades + " y reparar " + arreglos + " su moto fue reparada, tras lo cual ");
        System.out.println("usted salió a las " + salidah + ":" + salidam);
    }

}
