package laboratorio2;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa: ");
		String messaggio = input.nextLine();
		if (!(messaggio.length() > 0)) {
			System.out.println("errore");
			System.exit(1);
		}
		System.out.print("Inserisci un numero: ");
		int posizione = input.nextInt();
		if (!(posizione >= 0 && posizione < messaggio.length())) {
			System.out.println("errore");
			System.exit(1);
		}
		input.nextLine();
		System.out.print("Inserisci un'altra stringa: ");
		String stringa = input.nextLine();
		if (!(stringa.length() > 0)) {
			System.out.println("errore");
			System.exit(1);
		}
		input.close();
		System.out
				.println("Il messaggio è: " + messaggio.substring(0, posizione) + stringa + messaggio.substring(posizione));

	}
}
