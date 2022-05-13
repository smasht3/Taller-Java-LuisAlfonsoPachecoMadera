import java.io.*;

public class uno {

	private static int i;


	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int[ ] num = new int[5];
		// ---------------------------------
		for (i=0;i<=4;i++) {
			System.out.print("Escribe tu "+((i * 1)+1)+" n�mero ");
			num[i] = Integer.parseInt(bufEntrada.readLine());
		}
		for (i=0;i<=4;i++) {
			System.out.println("["+i+"] = "+num[i]);
		}
	}


}

