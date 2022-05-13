import java.util.Scanner;

public class siete {

    private static int peso;
    private static double estatura;
    private static double imc;
    private static double estaturacuadrada;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a a Secretaría de Salud Municipal");
        System.out.println("Hoy calcularemos tu índice de masa corporal");
        System.out.println("Digite su peso en kg");
        peso = input.nextInt();

        System.out.println("Digite su estatura en metros");
        estatura = input.nextDouble();

        estaturacuadrada = estatura * estatura;
        imc = peso / estaturacuadrada;

        if (imc < 18.5){

            System.out.println("Usted posee un IMC de " + imc + " su peso es inferior al normal");

        } else if (imc >= 18.5 & imc < 25) {

            System.out.println("Usted posee un IMC de " + imc + " su peso es normal");
            
        } else if (imc >= 25 & imc < 30) {

            System.out.println("Usted posee un IMC de " + imc + " su peso es superior al normal");

        } else if (imc >= 30) {

            System.out.println("Usted posee un IMC de " + imc + " su peso es obesidad");

        }

    }

}
