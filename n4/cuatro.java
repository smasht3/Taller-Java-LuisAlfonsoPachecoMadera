public class cuatro {

	private static int columna;
	private static int fila;

	public static void main(String args[]) {


		int[][] matriz = new int[3][10];
		// --------------------------------
		for (fila=0;fila<=1;fila++) {
			for (columna=0;columna<=9;columna++) {
				matriz[fila][columna] = ((fila*10)+columna)+1;
			}
		}
		// --------------------------------
		System.out.println("Matriz organizada: ");
		for (fila=0;fila<=1;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
			for (columna=5;columna<=9;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		// --------------------------------
		System.out.println("Matriz inversa: ");
		for (fila=0;fila<=1;fila++) {
			for (columna=0;columna<=4;columna++) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
			for (columna=9;columna>=5;columna--) {
				System.out.print(matriz[fila][columna]+" ");
			}
			System.out.println("");
		}
	}


}

