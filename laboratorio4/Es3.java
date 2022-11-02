package laboratorio4;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int esponente;
		int pow = 1;
		do {
			esponente = input.nextInt();
		} while (esponente < 0);
		input.close();

		if (esponente > 0) {
			while (esponente > 0) {
				pow *= base;
				esponente--;
			}
		}

		System.out.println(pow);
	}
}
