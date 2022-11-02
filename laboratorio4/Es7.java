package laboratorio4;

import java.util.Scanner;

public class Es7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, fib, temp1, temp2, i;
		do {
			n = input.nextInt();
		} while (n < 0);
		input.close();

		if (n == 0) {
			fib = 0;
		} else if (n == 1) {
			fib = 1;
		} else {
			for (i = 2, fib = 1, temp1 = 1, temp2 = 0; i <= n; i++, fib = temp2 + temp1, temp2 = temp1, temp1 = fib) {
			}
		}
		System.out.println(fib);
	}
}
