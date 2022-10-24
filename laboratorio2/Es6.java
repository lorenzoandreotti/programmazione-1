package laboratorio2;

import java.util.Scanner;

public class Es6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci la prima stringa: ");
		String s1 = input.nextLine();
		System.out.print("Inserisci la seconda stringa: ");
		String s2 = input.nextLine();
		input.close();

		for (int i = 0; i < 5; i++) {
			if (s1.length() != 5 ||
					s2.length() != 5 ||
					(s1.charAt(i) != '+' && s1.charAt(i) != '-') ||
					(s2.charAt(i) != '+' && s2.charAt(i) != '-')) {
				System.out.println("errore");
				System.exit(1);
			}
		}

		int a = 0, b = 4;

		for (int i = 0; i < 5; i++) {
			if (s1.charAt(i) == '+') {
				a++;
			} else {
				a--;
			}

			if (s2.charAt(i) == '+') {
				b++;
			} else {
				b--;
			}

			if (a == b) {
				System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
				System.exit(0);
			}
		}

		System.out.println("Il valore di a è " + a + ", il valore di b è " + b);

	}
}
