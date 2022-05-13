import java.util.Scanner;

public class cuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu capital:");
        String capital = sc.nextLine();

        System.out.println("Escribe el país al que pertenece:");
        String pais = sc.nextLine();

        System.out.println("La ciudad: " + capital + " es la capital de: " + pais);
    }

}
