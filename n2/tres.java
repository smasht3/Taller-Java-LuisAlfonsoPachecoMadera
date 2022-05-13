import java.util.Scanner;

public class tres {

    private static int edad;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite su nombre");
        String nombre = sc.nextLine();

        System.out.println("Digite su apellido");
        String apellido = sc.nextLine();

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu edad en años");
        edad = input.nextInt();

        if (edad < 18) {

            System.out.print(nombre + " " + apellido + " usted es menor de edad, por lo tanto, ");
            System.out.println("no puede entrar a la fiesta, por favor devuélvase a su casa.");

        }
        else {

            System.out.println(nombre + " " + apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");

        }

    }

}
