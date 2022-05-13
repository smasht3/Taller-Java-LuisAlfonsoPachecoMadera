public class dos {

	private static int incremento;
	private static int maximo;

	public static void main(String args[]) {

		// -------------------------------
		incremento = 1;
		maximo = 11;
		while (maximo>1) {
			incremento = 1;
			while (incremento<maximo) {
				System.out.print(" ");
				incremento = incremento+1;
			}
			maximo = maximo-1;
			incremento = 11;
			while (incremento>maximo) {
				System.out.print("*");
				incremento = incremento-1;
			}
			System.out.println("");
		}
	}


}

