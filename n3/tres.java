public class tres {

	private static int incremento;
	private static int maximo;

	public static void main(String args[]) {

		// ---------------------------------
		incremento = 0;
		maximo = 10;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=11);
		System.out.println("*");
		// ---------------------------------
		incremento = 0;
		do {
			incremento = 10;
			incremento = incremento-maximo;
			do {
				System.out.print(" ");
				incremento = incremento+1;
			} while (incremento!=10);
			// ---------------------------------
			incremento = 10;
			do {
				System.out.print("*");
				incremento = incremento-1;
			} while (incremento>=maximo);
			// ---------------------------------
			System.out.print("*");
			// ---------------------------------
			incremento = 10;
			do {
				System.out.print("*");
				incremento = incremento-1;
			} while (incremento>=maximo);
			// ---------------------------------
			maximo = maximo-1;
			System.out.println("");
		} while (maximo!=0);
		// ---------------------------------
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=10);
		System.out.println("***");
		// ---------------------------------
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=10);
		System.out.println("***");
		// ---------------------------------
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=9);
		incremento = 0;
		do {
			System.out.print("*");
			incremento = incremento+1;
		} while (incremento!=5);
		System.out.println("");
		// ---------------------------------
		incremento = 0;
		do {
			System.out.print(" ");
			incremento = incremento+1;
		} while (incremento!=8);
		incremento = 0;
		do {
			System.out.print("*");
			incremento = incremento+1;
		} while (incremento!=7);
		System.out.println("");
		// ---------------------------------
	}


}

