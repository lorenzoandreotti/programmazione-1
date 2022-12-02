package laboratorio5;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			n = input.nextInt();
		} while (!(n > 0));
		input.close();

		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				int j;
				for (j = 0; n % i == 0; j++) {
					n /= i;
				}
				System.out.println(i + "\t" + j);
			}
		} else {
			System.out.println(1);
		}
	}
}
