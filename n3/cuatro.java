import java.io.*;
public class cuatro {

	private static int contador;
	private static int multiplicador;
	private static int num;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		// ---------------------------------
		System.out.println("Bienvenido a la tabla de multiplicar");
		System.out.println("Digite el n�mero del cual requieres su tabla");
		num = Integer.parseInt(bufEntrada.readLine());
		contador = 1;
		for (contador=1;contador<=10;contador++) {
			multiplicador = num*contador;
			System.out.println(num+" x "+contador+" = "+multiplicador);
		}
	}


}

