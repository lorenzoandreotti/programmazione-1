package laboratorio5;

import java.util.Scanner;

public class Es5bis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroMassimo;
		do {
			numeroMassimo = input.nextInt();
		} while (!(numeroMassimo > 0));
		input.close();

		for (int i = 1; i <= numeroMassimo; i++) {
			int temp = i;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp /= 2;
				} else {
					temp = 3 * temp + 1;
				}
			}
			System.out.println(i + " sì");
		}
	}
}
