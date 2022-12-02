package laboratorio6;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char c = input.nextLine().charAt(0);
		input.close();
		if (cercaCarattere(s, c)) {
			System.out.println(rimuoviCarattere(s, c));
		}
	}

	private static boolean cercaCarattere(String s, char c) {
		if (s.contains(c + "")) {
			return true;
		}
		return false;
	}

	private static String rimuoviCarattere(String s, char c) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				newString = newString.concat(s.charAt(i) + "");
			}
		}
		return newString;
	}

}
