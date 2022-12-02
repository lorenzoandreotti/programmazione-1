package laboratorio5;

import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		do {
			n = input.nextInt();
			m = input.nextInt();
		} while (!(n > 0) && !(m > 0));
		input.close();

		while (m != 0) {
			n++;
			m--;
		}

		System.out.println(n);
	}
}
