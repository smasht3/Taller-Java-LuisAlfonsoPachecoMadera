import java.util.Scanner;

public class dos {

    private static int edad;
    private static double estatura;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Aquí no es necesario que imprima lo que le dices,
        // solo lo puse para que se viera que el programa funciona

        System.out.println("Escribe tu nombre:");
        String nombre = sc.nextLine();
        System.out.println(nombre);

        System.out.println("Escribe tus apellidos:");
        String apellidos = sc.nextLine();
        System.out.println(apellidos);

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        edad = input.nextInt();
        System.out.println(edad);

        System.out.println("Escribe tu estatura (Usa comas)");
        estatura = input.nextDouble();
        System.out.println(estatura);

    }

}
