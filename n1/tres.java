import java.util.Scanner;

public class tres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombre = sc.nextLine();
        //System.out.println(nombre);

        System.out.println("Escribe tus apellidos:");
        String apellidos = sc.nextLine();
        //System.out.println(apellidos);

        //------------------------------------------------

        System.out.println("Escribe el nombre de tu madre:");
        String nombreMadre = sc.nextLine();
        //System.out.println(nombreMadre);

        System.out.println("Escribe el apellido de tu madre:");
        String apellidosMadre = sc.nextLine();
        //System.out.println(apellidosMadre);

        //------------------------------------------------

        System.out.println("Escribe el nombre de tu padre:");
        String nombrePadre = sc.nextLine();
        //System.out.println(nombrePadre);

        System.out.println("Escribe el apellido de tu padre:");
        String apellidosPadre = sc.nextLine();
        //System.out.println(apellidosPadre);

        //------------------------------------------------

        System.out.print("Yo " + nombre + " " + apellidos + " ");
        System.out.print("soy hijo de "+ nombreMadre + " " + apellidosMadre + " ");
        System.out.println("y " + nombrePadre + " " + apellidosPadre);
    }

}
