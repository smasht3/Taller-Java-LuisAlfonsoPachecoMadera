import java.io.*;

public class dos {

	private static int i;
	private static int tamanioimpares;
	private static int tamaniopares;
	private static int u;

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

		int[] num= new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		// ---------------------------------
		tamanioimpares = 0;
		tamaniopares = 0;
		// ---------------------------------
		for (i=0;i<=19;i++) {
			do {
				System.out.println("Escribe tu "+((i*1)+1)+" del 1 al 100");
				num[i] = Integer.parseInt(bufEntrada.readLine());
				if (num[i]<1 || num[i]>100) {
					System.out.println("No te salgas del l�mite");
				}
			} while (!(num[i]>0 && num[i]<=100));
		}
		// ---------------------------------
		for (i=0;i<=19;i++) {
			if (num[i]%2==0) {
				pares[tamaniopares] = num[i];
				tamaniopares = tamaniopares+1;
			}
		}
		for (i=0;i<=19;i++) {
			if (num[i]%2!=0) {
				impares[tamanioimpares] = num[i];
				tamanioimpares = tamanioimpares+1;
			}
		}
		// ---------------------------------
		System.out.println("Se han encontrado "+tamaniopares+" n�meros pares");
		tamaniopares = tamaniopares-1;
		for (i=0;i<=tamaniopares;i++) {
			System.out.print(pares[i]+", ");
		}
		System.out.println("");
		// ---------------------------------
		System.out.println("Se han encontrado "+tamanioimpares+" n�meros impares");
		tamanioimpares = tamanioimpares-1;
		for (i=0;i<=tamanioimpares;i++) {
			System.out.print(impares[i]+", ");
		}
		System.out.println("");
	}


}

