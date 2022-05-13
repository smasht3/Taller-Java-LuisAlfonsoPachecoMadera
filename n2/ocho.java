import java.util.Scanner;

public class ocho {

    private static int cantidad;
    private static int disponibles;
    private static int ventas;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        System.out.println("Don Carlos, por favor digite el número de pasteles disponibles");
        disponibles = input.nextInt();

        System.out.println("Bienvenidos a pasteles Don Carlos, has su pedido");
        System.out.println("¿De que sabor quieres la torta?");
        String sabor = sc.nextLine();

        System.out.println("¿Cuantos quieres?");
        cantidad = input.nextInt();

        if (cantidad > disponibles){

            System.out.println("No tenemos tal cantidad de pasteles");

        }
        else {

            System.out.println("¿Que decoración te gustaría?");
            String decoraciones = sc.nextLine();
            System.out.println("Usted ha pedido " + cantidad + " de pasteles");
            System.out.println("de " + sabor + " con decoraciones de " + decoraciones);
            ventas = ventas + cantidad;
            disponibles = disponibles - cantidad;

        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Don Carlos, usted hoy ha vendido " + ventas + " de pasteles");
        System.out.println("Quedan " + disponibles + " tortas por vender");

    }

}
