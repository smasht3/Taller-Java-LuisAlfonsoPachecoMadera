import java.io.*;

public class ocho {

	private static boolean aprobado1;
	private static boolean aprobado2;
	private static boolean aprobado3;
	private static boolean aprobado4;
	private static boolean aprobado5;
	private static boolean aprobado6;
	private static boolean aprobado7;
	private static boolean aprobado8;
	private static int espacio;
	private static String ingresados1;
	private static String ingresados2;
	private static String ingresados3;
	private static String ingresados4;
	private static String ingresados5;
	private static String ingresados6;
	private static String ingresados7;
	private static String ingresados8;
	private static boolean nuevoaprobado;
	private static String nuevoingresado;
	private static int opcion;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		// -------------------------------------
		ingresados1 = "Vacio";
		aprobado1 = false;
		ingresados2 = "Vacio";
		aprobado2 = false;
		ingresados3 = "Vacio";
		aprobado3 = false;
		ingresados4 = "Vacio";
		aprobado4 = false;
		ingresados5 = "Vacio";
		aprobado5 = false;
		ingresados6 = "Vacio";
		aprobado6 = false;
		ingresados7 = "Vacio";
		aprobado7 = false;
		ingresados8 = "Vacio";
		aprobado8 = false;
		// -------------------------------------
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("Bienvenido a la escuela automovil�stica El Maestro");
			System.out.println("�Que desea hacer?");
			System.out.println("1: Registrar cliente");
			System.out.println("2: Consultar clientes");
			System.out.println("3: Salir");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Tienes los siguientes espacios:");
				System.out.println("1: "+ingresados1);
				System.out.println("2: "+ingresados2);
				System.out.println("3: "+ingresados3);
				System.out.println("4: "+ingresados4);
				System.out.println("5: "+ingresados5);
				System.out.println("6: "+ingresados6);
				System.out.println("7: "+ingresados7);
				System.out.println("8: "+ingresados8);
				System.out.println(" ");
				System.out.println("�Donde deseas guardarlo?");
				System.out.println("Ten en cuenta que esto sobre-escribir� los datos perdiendose para siempre");
				espacio = Integer.parseInt(bufEntrada.readLine());
				System.out.println("Escribe el nombre del ingresado");
				nuevoingresado = bufEntrada.readLine();
				System.out.println("�Ha aprobado?");
				System.out.println("1: No");
				System.out.println("2: Si");
				opcion = Integer.parseInt(bufEntrada.readLine());
				switch (opcion) {
				case 1:
					nuevoaprobado = false;
					break;
				case 2:
					nuevoaprobado = true;
					break;
				default:
					System.out.println("Elija bien");
				}
				switch (espacio) {
				case 1:
					ingresados1 = nuevoingresado;
					aprobado1 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 2:
					ingresados2 = nuevoingresado;
					aprobado2 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 3:
					ingresados3 = nuevoingresado;
					aprobado3 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 4:
					ingresados4 = nuevoingresado;
					aprobado4 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 5:
					ingresados5 = nuevoingresado;
					aprobado5 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 6:
					ingresados6 = nuevoingresado;
					aprobado6 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 7:
					ingresados7 = nuevoingresado;
					aprobado7 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				case 8:
					ingresados8 = nuevoingresado;
					aprobado8 = nuevoaprobado;
					System.out.println("Registrado con exito");
					break;
				}
				System.out.println("Presione un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				break;
			case 2:
				System.out.println("Se han registrado los siguientes clientes: ");
				System.out.println("");
				if (!ingresados1.equals("Vacio")) {
					System.out.println(ingresados1);
					if (aprobado1==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados2.equals("Vacio")) {
					System.out.println(ingresados2);
					if (aprobado2==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados3.equals("Vacio")) {
					System.out.println(ingresados3);
					if (aprobado3==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados4.equals("Vacio")) {
					System.out.println(ingresados4);
					if (aprobado4==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados5.equals("Vacio")) {
					System.out.println(ingresados5);
					if (aprobado5==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados6.equals("Vacio")) {
					System.out.println(ingresados6);
					if (aprobado6==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados7.equals("Vacio")) {
					System.out.println(ingresados7);
					if (aprobado7==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				if (!ingresados8.equals("Vacio")) {
					System.out.println(ingresados8);
					if (aprobado8==true) {
						System.out.println("Ha aprobado el curso");
						System.out.println("");
					} else {
						System.out.println("Aun no ha aprobado el curso");
						System.out.println("");
					}
				}
				System.out.println("Presione un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				break;
			}
		} while (opcion!=3);
		System.out.println("Gracias por utilizar nuestro programa");
	}


}

