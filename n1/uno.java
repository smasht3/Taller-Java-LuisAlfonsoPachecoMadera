import java.util.Scanner;

    public class uno {

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
        }

}
