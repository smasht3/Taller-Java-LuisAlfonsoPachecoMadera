import java.util.Scanner;

public class dos {

    private static int edad;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        edad = input.nextInt();

        if (edad < 18)
            System.out.println("Usted aún es un niño(a).");

    }

}
