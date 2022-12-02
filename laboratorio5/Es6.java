package laboratorio5;

import java.util.Scanner;

public class Es6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String genoma = input.nextLine();
		String proteina = input.nextLine();
		input.close();

		for (int i = 0; i < genoma.length() - proteina.length(); i++) {
			int j = 0;
			while (j < proteina.length() && j < genoma.length() - proteina.length()
					&& genoma.charAt(i + j) == proteina.charAt(j)) {
				j++;
			}
			if (j == proteina.length()) {
				System.out.println("pos\t" + i);
			}
		}
	}
}
