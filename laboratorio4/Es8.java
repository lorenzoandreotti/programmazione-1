package laboratorio4;

import java.util.Scanner;

public class Es8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m, mcd;
		do {
			n = input.nextInt();
		} while (n <= 0);
		do {
			m = input.nextInt();
		} while (m <= 0);

		input.close();

		while (n != m) {
			if (n > m) {
				n -= m;
			} else {
				m -= n;
			}
		}
		mcd = n;

		System.out.println(mcd);
	}
}
