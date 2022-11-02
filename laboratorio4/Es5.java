package laboratorio4;

import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		int quoziente = 0, resto;
		do {
			n = input.nextInt();
		} while (n <= 0);
		do {
			m = input.nextInt();
		} while (m <= 0);
		input.close();

		while (n >= m) {
			n -= m;
			quoziente++;
		}
		resto = n;

		System.out.println("quoziente " + quoziente);
		System.out.println("resto " + resto);

	}
}
