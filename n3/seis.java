import java.io.*;

public class seis {

	private static int eliminar;
	private static String nombre1;
	private static String nombre2;
	private static String nombre3;
	private static String nuevaorganizacion;
	private static String nuevonombre;
	private static int nuevotelefono;
	private static int opcion;
	private static String organizacion1;
	private static String organizacion2;
	private static String organizacion3;
	private static boolean salir;
	private static int telefono1;
	private static int telefono2;
	private static int telefono3;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		// ----------------------------------------
		nombre1 = "Vacio";
		telefono1 = 0;
		organizacion1 = "Vacio";
		nombre2 = "Vacio";
		telefono2 = 0;
		organizacion2 = "Vacio";
		nombre3 = "Vacio";
		telefono3 = 0;
		organizacion3 = "Vacio";
		// ----------------------------------------
		do {
			salir = false;
			System.out.println("Elije una de las siguientes opciones:");
			System.out.println("1: Agregar contacto.");
			System.out.println("2: Ver contactos.");
			System.out.println("3: Eliminar contactos.");
			System.out.println("4: Salir.");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Elije donde deseas guardar el contacto");
				System.out.println("1: "+nombre1+" : "+telefono1+" : "+organizacion1);
				System.out.println("2: "+nombre2+" : "+telefono2+" : "+organizacion2);
				System.out.println("3: "+nombre3+" : "+telefono3+" : "+organizacion3);
				opcion = Integer.parseInt(bufEntrada.readLine());
				if (opcion>3) {
					opcion = 3;
				}
				System.out.println("Digite el nombre");
				nuevonombre = bufEntrada.readLine();
				System.out.println("Digite el n�mero");
				nuevotelefono = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Digite la organizacion");
				nuevaorganizacion = bufEntrada.readLine();
				switch (opcion) {
				case 1:
					nombre1 = nuevonombre;
					telefono1 = nuevotelefono;
					organizacion1 = nuevaorganizacion;
					salir = true;
					System.out.println("Contacto 1 agregado");
					break;
				case 2:
					nombre2 = nuevonombre;
					telefono2 = nuevotelefono;
					organizacion2 = nuevaorganizacion;
					salir = true;
					System.out.println("Contacto 2 agregado");
					break;
				case 3:
					nombre3 = nuevonombre;
					telefono3 = nuevotelefono;
					organizacion3 = nuevaorganizacion;
					salir = true;
					System.out.println("Contacto 3 agregado");
					break;
				}
				System.out.println("Presiona un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				// ---------------------------------------- 
				break;
			case 2:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Tienes guardados los siguientes contactos");
				System.out.println(nombre1+" : "+telefono1+" : "+organizacion1);
				System.out.println(nombre2+" : "+telefono2+" : "+organizacion2);
				System.out.println(nombre3+" : "+telefono3+" : "+organizacion3);
				System.out.println("Presiona un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				// ----------------------------------------
				break;
			case 3:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Tienes guardados los siguientes contactos");
				System.out.println("1: "+nombre1+" : "+telefono1+" : "+organizacion1);
				System.out.println("2: "+nombre2+" : "+telefono2+" : "+organizacion2);
				System.out.println("3: "+nombre3+" : "+telefono3+" : "+organizacion3);
				do {
					System.out.println("Escribe 1, 2 o 3 para seleccionar el contacto a borrar");
					System.out.println("O presiona 4 para salir");
					eliminar = Integer.parseInt(bufEntrada.readLine());
					switch (eliminar) {
					case 1:
						nombre1 = "Vacio";
						telefono1 = 0;
						organizacion1 = "Vacio";
						salir = true;
						System.out.println("Contacto 1 eliminado");
						break;
					case 2:
						nombre2 = "Vacio";
						telefono2 = 0;
						organizacion2 = "Vacio";
						salir = true;
						System.out.println("Contacto 2 eliminado");
						break;
					case 3:
						nombre3 = "Vacio";
						telefono3 = 0;
						organizacion3 = "Vacio";
						salir = true;
						System.out.println("Contacto 3 eliminado");
						break;
					case 4:
						salir = true;
						break;
					default:
						System.out.println("Elija bien");
					}
					// ----------------------------------------
				} while (salir!=true);
				System.out.println("Presiona un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			}
		} while (opcion!=4);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Gracias por utilizar nuestros servicios");
	}


}

