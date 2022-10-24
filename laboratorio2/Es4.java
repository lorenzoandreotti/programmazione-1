package laboratorio2;

import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa di 4 caratteri: ");
		String s = input.nextLine();
		input.close();
		if (s.length() != 4) {
			System.out.println("La stringa non è di 4 caratteri!");
			System.exit(1);
		}

		// int n = Integer.parseInt(s);

		int n = 0;

		for (int i = 0, j = 1000; i < s.length(); i++, j /= 10) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				n += (s.charAt(i) - '0') * j;
			} else {
				System.out.println("La stringa contiene caratteri non validi!");
				System.exit(1);
			}
		}

		System.out.println("Il numero corrispondente è: " + n);

	}
}
