package laboratorio4;

import java.util.Scanner;

public class Es1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, x;
		do {
			System.out.println("inserisci un nuemro");
			n = input.nextInt();
		} while (n <= 0);
		do {
			x = input.nextInt();
		} while (x != n);
		input.close();
	}
}
