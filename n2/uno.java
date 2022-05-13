import java.util.Scanner;

public class uno {

    private static int edad;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        edad = input.nextInt();

        if (edad >= 18)
            System.out.println("Usted es mayor de edad.");

    }

}
