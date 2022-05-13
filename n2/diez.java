import java.util.Scanner;

public class diez {

    private static int opcion;
    private static double guardado;
    private static double consulta;

    public static void main(String[] args){

        guardado = 500;

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a su banco fiel");
        System.out.println("Digite su nombre como titular");
        String titular = sc.nextLine();

        System.out.println("Bienvenido " + titular + ". ¿Que deseas hacer hoy?");
        System.out.println("1: Ingresar dinero");
        System.out.println("2: Retirar dinero");
        System.out.println("3: Consultar dinero");

        opcion = input.nextInt();
        switch (opcion){

            case 1:
                System.out.println("¿Cuanto dinero quieres ingresar?");
                consulta = input.nextDouble();
                if (consulta <= 0){

                    System.out.println("No se aceptan cantidades negativas");

                }
                else {

                    guardado = guardado + consulta;
                    System.out.println("Haz guardado " + consulta + "$");
                    System.out.println("Tiene guardado un total de " + guardado + "$");

                }
                break;

            case 2:
                System.out.println("¿Cuanto dinero quieres retirar?");
                consulta = input.nextDouble();
                if (consulta <= 0){

                    System.out.println("No se aceptan cantidades negativas");

                }
                else {

                    if (consulta > guardado){

                        System.out.println("No puedes retirar dinero que no tienes");

                    }
                    else{

                        guardado = guardado - consulta;
                        System.out.println("Haz retirado " + consulta + "$");
                        System.out.println("Tiene guardado un total de " + guardado + "$");

                    }
                    break;

                }
            case 3:
                System.out.println("Usted tiene " + guardado + "$");
                break;


        }

    }

}
