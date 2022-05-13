import java.util.Scanner;

public class nueve {

    private static int opcion;
    private static double base;
    private static double altura;
    private static double menor;
    private static double area;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Buenas estudiante, ¿Que es lo que quieres calcular?");
        System.out.println("1: Área de rectángulo");
        System.out.println("2: Área de triangulo");
        System.out.println("3: Área de trapecio");

        opcion = input.nextInt();
        switch (opcion) {

            case 1:
                System.out.println("Escribe el tamaño en centímetros de la base");
                base = input.nextInt();
                System.out.println("Escribe el tamaño en centímetros de la altura");
                altura = input.nextInt();

                area = base * altura;
                System.out.println("Tu rectángulo tiene un área de " + area);
                break;

            case 2:
                System.out.println("Escribe el tamaño en centímetros de la base");
                base = input.nextInt();
                System.out.println("Escribe el tamaño en centímetros de la altura");
                altura = input.nextInt();

                area = (base * altura) / 2;
                System.out.println("Tu triangulo tiene un área de " + area);
                break;

            case 3:
                System.out.println("Escribe el tamaño en centímetros de la base mayor");
                base = input.nextInt();
                System.out.println("Escribe el tamaño en centímetros de la base menor");
                menor = input.nextInt();
                System.out.println("Escribe el tamaño en centímetros de la altura");
                altura = input.nextInt();

                area = ((base + menor) / 2) * altura;
                System.out.println("Tu trapecio tiene un área de " + area);
                break;

        }

    }

}
