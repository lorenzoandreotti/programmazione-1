package laboratorio6;

import java.util.Scanner;

class Es1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String s = "";
		do {
			n = input.nextInt();
			if (n > 0) {
				s = aggiornaStringa(n, s);
			}
			if (n < 0) {
				System.out.println("Inserire un valore positivo");
			}
		} while (n != 0);
		input.close();

		for (int i = 0; i < s.length(); i += 2) {
			System.out.println(s.charAt(i));
		}

	}

	private static String aggiornaStringa(int n, String s) {
		return s.concat(n + "");
	}

}