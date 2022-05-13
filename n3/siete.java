import java.io.*;

public class siete {

	private static String marca1;
	private static String marca2;
	private static String marca3;
	private static String marca4;
	private static String marca5;
	private static String nombre1;
	private static String nombre2;
	private static String nombre3;
	private static String nombre4;
	private static String nombre5;
	private static String nuevomovimiento;
	private static int opcion;
	private static String placa1;
	private static String placa2;
	private static String placa3;
	private static String placa4;
	private static String placa5;

	private static boolean salir;
	private static String telefono1;
	private static String telefono2;
	private static String telefono3;
	private static String telefono4;
	private static String telefono5;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));


		placa1 = "Vacio";
		marca1 = "Vacio";
		nombre1 = "Vacio";
		telefono1 = "Vacio";
		placa2 = "Vacio";
		marca2 = "Vacio";
		nombre2 = "Vacio";
		telefono2 = "Vacio";
		placa3 = "AAA-123";
		marca3 = "BMW";
		nombre3 = "Julian Lasso";
		telefono3 = "312 345 6789";
		placa4 = "Vacio";
		marca4 = "Vacio";
		nombre4 = "Vacio";
		telefono4 = "Vacio";
		placa5 = "Vacio";
		marca5 = "Vacio";
		nombre5 = "Vacio";
		telefono5 = "Vacio";
		// ----------------------------------------
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("Bienvenidos a parqueaderos El guard�an");
			System.out.println("�Que deseas hacer?");
			System.out.println("1: Ingresar vehiculo");
			System.out.println("2: Retirar vehiculo");
			System.out.println("3: Consultar vehiculo");
			System.out.println("4: Salir del programa");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				// Si placa1 <> "Vacio" o placa2 <> "Vacio" o placa3 <> "Vacio" o placa4 <> "Vacio" o placa5 <> "Vacio" Entonces
				if (!placa1.equals("Vacio")&!placa2.equals("Vacio")&!placa3.equals("Vacio")&!placa4.equals("Vacio")&!placa5.equals("Vacio")) {
					System.out.println(""); // no hay forma directa de borrar la consola en Java
					System.out.println("Lo sentimos, no hay espacios libres");
					System.out.println("Presiona un bot�n para continuar");
					System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				} else {
					System.out.println(""); // no hay forma directa de borrar la consola en Java
					System.out.println("Digite los siguientes datos:");
					if (placa1.equals("Vacio")) {
						System.out.print("Placa: ");
						nuevomovimiento = bufEntrada.readLine();
						placa1 = nuevomovimiento;
						System.out.print("Marca: ");
						nuevomovimiento = bufEntrada.readLine();
						marca1 = nuevomovimiento;
						System.out.print("Nombre del due�o: ");
						nuevomovimiento = bufEntrada.readLine();
						nombre1 = nuevomovimiento;
						System.out.print("Telefono: ");
						nuevomovimiento = bufEntrada.readLine();
						telefono1 = nuevomovimiento;
					} else {
						if (placa2.equals("Vacio")) {
							System.out.print("Placa: ");
							nuevomovimiento = bufEntrada.readLine();
							placa2 = nuevomovimiento;
							System.out.print("Marca: ");
							nuevomovimiento = bufEntrada.readLine();
							marca2 = nuevomovimiento;
							System.out.print("Nombre del due�o: ");
							nuevomovimiento = bufEntrada.readLine();
							nombre2 = nuevomovimiento;
							System.out.print("Telefono: ");
							nuevomovimiento = bufEntrada.readLine();
							telefono2 = nuevomovimiento;
						} else {
							if (placa3.equals("Vacio")) {
								System.out.print("Placa: ");
								nuevomovimiento = bufEntrada.readLine();
								placa3 = nuevomovimiento;
								System.out.print("Marca: ");
								nuevomovimiento = bufEntrada.readLine();
								marca3 = nuevomovimiento;
								System.out.print("Nombre del due�o: ");
								nuevomovimiento = bufEntrada.readLine();
								nombre3 = nuevomovimiento;
								System.out.print("Telefono: ");
								nuevomovimiento = bufEntrada.readLine();
								telefono3 = nuevomovimiento;
							} else {
								if (placa4.equals("Vacio")) {
									System.out.print("Placa: ");
									nuevomovimiento = bufEntrada.readLine();
									placa4 = nuevomovimiento;
									System.out.print("Marca: ");
									nuevomovimiento = bufEntrada.readLine();
									marca4 = nuevomovimiento;
									System.out.print("Nombre del due�o: ");
									nuevomovimiento = bufEntrada.readLine();
									nombre4 = nuevomovimiento;
									System.out.print("Telefono: ");
									nuevomovimiento = bufEntrada.readLine();
									telefono4 = nuevomovimiento;
								} else {
									System.out.print("Placa: ");
									nuevomovimiento = bufEntrada.readLine();
									placa5 = nuevomovimiento;
									System.out.print("Marca: ");
									nuevomovimiento = bufEntrada.readLine();
									marca5 = nuevomovimiento;
									System.out.print("Nombre del due�o: ");
									nuevomovimiento = bufEntrada.readLine();
									nombre5 = nuevomovimiento;
									System.out.print("Telefono: ");
									nuevomovimiento = bufEntrada.readLine();
									telefono5 = nuevomovimiento;
								}
							}
						}
					}
					System.out.println("Operaci�n finalizada");
					System.out.println("Presiona un bot�n para continuar");
					System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				}
				break;
			case 2:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Digite el n�mero respectivo al auto a retirar");
				System.out.println("1: "+placa1+" : "+marca1+" : "+nombre1);
				System.out.println("2: "+placa2+" : "+marca2+" : "+nombre2);
				System.out.println("3: "+placa3+" : "+marca3+" : "+nombre3);
				System.out.println("4: "+placa4+" : "+marca4+" : "+nombre4);
				System.out.println("5: "+placa5+" : "+marca5+" : "+nombre5);
				opcion = Integer.parseInt(bufEntrada.readLine());
				switch (opcion) {
				case 1:
					placa1 = "Vacio";
					marca1 = "Vacio";
					nombre1 = "Vacio";
					telefono1 = "Vacio";
					break;
				case 2:
					placa2 = "Vacio";
					marca2 = "Vacio";
					nombre2 = "Vacio";
					telefono2 = "Vacio";
					break;
				case 3:
					placa3 = "Vacio";
					marca3 = "Vacio";
					nombre3 = "Vacio";
					telefono3 = "Vacio";
					break;
				case 4:
					placa4 = "Vacio";
					marca4 = "Vacio";
					nombre4 = "Vacio";
					telefono4 = "Vacio";
					break;
				case 5:
					placa5 = "Vacio";
					marca5 = "Vacio";
					nombre5 = "Vacio";
					telefono5 = "Vacio";
					break;
				default:
					System.out.println("Elija bien");
				}
				System.out.println("Operaci�n finalizada");
				System.out.println("Presiona un bot�n para continuar");
				System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				break;
			case 3:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Escribe la placa del vehiculo");
				nuevomovimiento = bufEntrada.readLine();
				if (nuevomovimiento.equals(placa1)) {
					System.out.println("El vehiculo que buscas est� en el parqueadero N1");
					System.out.println("Marca: "+marca1);
					System.out.println("Placa: "+placa1);
					System.out.println("Due�o: "+nombre1);
					System.out.println("Contacto: "+telefono1);
					System.out.println("Presiona un bot�n para continuar");
					System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
				} else {
					if (nuevomovimiento.equals(placa2)) {
						System.out.println("El vehiculo que buscas est� en el parqueadero N2");
						System.out.println("Marca: "+marca2);
						System.out.println("Placa: "+placa2);
						System.out.println("Due�o: "+nombre2);
						System.out.println("Contacto: "+telefono2);
						System.out.println("Presiona un bot�n para continuar");
						System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
					} else {
						if (nuevomovimiento.equals(placa3)) {
							System.out.println("El vehiculo que buscas est� en el parqueadero N3");
							System.out.println("Marca: "+marca3);
							System.out.println("Placa: "+placa3);
							System.out.println("Due�o: "+nombre3);
							System.out.println("Contacto: "+telefono3);
							System.out.println("Presiona un bot�n para continuar");
							System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
						} else {
							if (nuevomovimiento.equals(placa4)) {
								System.out.println("El vehiculo que buscas est� en el parqueadero N4");
								System.out.println("Marca: "+marca4);
								System.out.println("Placa: "+placa4);
								System.out.println("Due�o: "+nombre4);
								System.out.println("Contacto: "+telefono4);
								System.out.println("Presiona un bot�n para continuar");
								System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
							} else {
								if (nuevomovimiento.equals(placa5)) {
									System.out.println("El vehiculo que buscas est� en el parqueadero N5");
									System.out.println("Marca: "+marca5);
									System.out.println("Placa: "+placa5);
									System.out.println("Due�o: "+nombre5);
									System.out.println("Contacto: "+telefono5);
									System.out.println("Presiona un bot�n para continuar");
									System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
								} else {
									System.out.println("El vehiculo que buscas no est� guardado aqu�");
									System.out.println("Presiona un bot�n para continuar");
									System.in.read(); // a diferencia del pseudoc�digo, espera un Enter, no cualquier tecla
								}
							}
						}
					}
				}
				break;
			}
		} while (opcion!=4);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Gracias por usar nuestro programa");
	}


}

