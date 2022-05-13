/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CINCO.java."

import java.io.*;

public class cinco {

	private static int columna;
	private static int fila;
	private static int filero;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		int[][] matriz = new int[11][11];
		String[] letrasfilas = new String[5];
		// --------------------------------
		filero = 0;
		letrasfilas[0] = "F";
		letrasfilas[1] = "I";
		letrasfilas[2] = "L";
		letrasfilas[3] = "A";
		letrasfilas[4] = "S";
		// --------------------------------
		System.out.println("       C     O     L     U     M     N     A     S");
		System.out.print("       ");
		for (columna=0;columna<=9;columna++) {
			System.out.print(columna+1+":    ");
		}
		System.out.println(" ");
		for (fila=0;fila<=8;fila++) {
			if (filero<5) {
				System.out.print(letrasfilas[filero]+": ");
				filero = filero+1;
			} else {
				System.out.print("   ");
			}
			System.out.print(fila+1+": ");
			for (columna=0;columna<=9;columna++) {
				System.out.print(fila+1+" x "+columna+1+" ");
				matriz[fila][columna] = fila*columna;
			}
			System.out.println(" ");
		}
		System.out.print("   10:");
		for (columna=0;columna<=9;columna++) {
			System.out.print(10+" x"+columna+1+" ");
			matriz[fila][columna] = 10*columna;
		}
		System.out.println("");
		System.out.println("�De que columna es la multiplicación?");
		columna = Integer.parseInt(bufEntrada.readLine());
		System.out.println("�De que fila es la multiplicación?");
		fila = Integer.parseInt(bufEntrada.readLine());
		System.out.println("La multiplicación de esa celda da como resultado: "+matriz[fila][columna]);
	}


}

