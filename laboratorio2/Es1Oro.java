package laboratorio2;

import java.util.Scanner;

public class Es1Oro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String espressione = input.nextLine();
		input.close();

		if (!espressione.matches("[0-9]+[[+-][0-9]+]+")) {
			System.out.println("errore");
			System.exit(1);
		}

		String[] values = espressione.split("[+-]");
		String[] operators = espressione.split("[0-9]+");

		int n = Integer.parseInt(values[0]);

		for (int i = 1; i < operators.length; i++) {
			if (operators[i].charAt(0) == '+') {
				n += Integer.parseInt(values[i]);
			} else {
				n -= Integer.parseInt(values[i]);
			}
		}

		System.out.println(n);
	}
}
