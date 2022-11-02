package laboratorio3;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci una frase");
		String frase = input.nextLine();
		input.close();

		if (frase.split(" ").length >= 2) {
			System.out.println("La frase contiene 2 o più parole");
			System.out.println(frase.split(" ")[0] + " " + frase.split(" ")[0].length());
			System.out.println(
					frase.split(" ")[frase.split(" ").length - 1] + " "
							+ frase.split(" ")[frase.split(" ").length - 1].length());
		} else if (frase.split(" ").length == 1) {
			System.out.println("La frase contiene 1 parola");
			System.out.println(frase + " " + frase.length());
		} else if (frase.length() == 0) {
			System.out.println("La frase non contiene parole");
		}
	}
}
