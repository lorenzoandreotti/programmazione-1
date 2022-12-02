package laboratorio5;

import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			n = input.nextInt();
		} while (!(n > 0));
		input.close();

		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			if (n != 1) {
				System.out.println(n);
			}
		}
		System.out.println(n);
	}
}
