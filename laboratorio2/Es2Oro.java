package laboratorio2;

import java.util.Scanner;

public class Es2Oro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		input.close();

		if (!s1.matches("[a-z]+") || !s2.matches("[A-Z]+")) {
			System.out.println("errore");
			System.exit(1);
		}

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		for (char c : arr1) {
			for (char d : arr2) {
				System.out.println(c + "," + d);
			}

		}

	}
}
