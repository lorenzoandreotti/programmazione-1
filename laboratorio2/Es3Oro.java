package laboratorio2;

import java.util.Scanner;

public class Es3Oro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stringa = input.nextLine();
		int m = input.nextInt();
		int n = input.nextInt();
		input.close();
		if (!stringa.matches("[a-z]+") || Integer.max((n + 1), (m + 1)) > stringa.length()
				|| Integer.min((n + 1), (m + 1)) < 0) {
			System.out.println("errore");
			System.exit(1);
		}

		char[] arr = stringa.toCharArray();

		arr[m % stringa.length()] += 'A' - 'a';

		for (int i = 1; (m + (i * n)) % stringa.length() != m % stringa.length(); i++) {
			arr[(m + (i * n)) % stringa.length()] += 'A' - 'a';
		}

		String nuovaStringa = "";

		for (char c : arr) {
			nuovaStringa = nuovaStringa.concat(c + "");
		}

		System.out.println(nuovaStringa);

	}
}
