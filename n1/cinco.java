import java.util.Scanner;

public class cinco {

    private static int edad;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de la mascota:");
        String nombre = sc.nextLine();

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la edad de la mascota");
        edad = input.nextInt();

        System.out.println("Escribe el tipo mascota:");
        String tipo = sc.nextLine();

        System.out.println("Escribe el nombre del dueño:");
        String duenio = sc.nextLine();

        System.out.print(nombre + " es un(a) " + tipo + " ");
        System.out.print("el cual tiene " + edad + " años de edad y ");
        System.out.println(duenio + " es actualmente su dueño");
    }

}
