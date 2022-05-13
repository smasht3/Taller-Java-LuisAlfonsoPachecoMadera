import java.io.*;

public class cinco {

	private static String nombre;
	private static int opcion;

	public static void main(String args[]) throws IOException, InterruptedException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		// ---------------------------------
		nombre = "nulo";
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("Men� de usuario");
			System.out.println("1. Capturar nombre");
			System.out.println("2. Saludar persona");
			System.out.println("3. Salir del sistema");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Escribe tu nombre");
				nombre = bufEntrada.readLine();
				System.out.println("Hemos capturado tu nombre");
				Thread.sleep(1*1000);
				break;
			case 2:
				if (nombre.equals("nulo")) {
					System.out.println("Digite un nombre en la primera opcion");
				} else {
					System.out.println("Hola "+nombre);
				}
				Thread.sleep((long)(1.5*1000));
				break;
			case 3:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Elija bien");
				Thread.sleep(1*1000);
			}
		} while (opcion!=3);
	}


}

