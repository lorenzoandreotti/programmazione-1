package Esercitazione3;

import java.util.Scanner;

class App {
	public static void main(String[] args) {
		// substituteCharInString();

		oddBelowFiftyOne();

	}

	static void substituteCharInString() {
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		input.close();

		phrase = phrase.substring(0, phrase.indexOf("n")) + "r" + phrase.substring(phrase.indexOf("n") + 1);
		System.out.println(phrase);
	}

	static void oddBelowFiftyOne() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		boolean isOdd = false, isBetween = false;
		if (n % 2 != 0) {
			isOdd = true;
		}
		if (n >= 5 && n <= 51) {
			isBetween = true;
		}
		System.out.println(n + (isOdd ? " pari, " : " dispari, ") + (isBetween ? ">=5 e <=51" : ""));
	}

}