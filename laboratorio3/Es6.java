package laboratorio3;

import java.util.Scanner;

public class Es6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean end = false;
		boolean valid = false;
		int n1, n2;
		char op;

		do {
			do {
				System.out.println(
						"+ per sommare\n- per sottrarre\n* per moltiplicare\n/ per dividere\nu per uscire dal programma");
				op = input.nextLine().toCharArray()[0];
				if (op == 'u') {
					end = true;
				} else if (op != '+' & op != '-' & op != '*' & op != '/') {
					valid = false;
					System.out.println("Error");
				} else {
					valid = true;
				}
			} while (!end && !valid);
			if (end) {
				input.close();
				return;
			} else {
				System.out.print("numero1: ");
				n1 = input.nextInt();
				System.out.print("numero2: ");
				n2 = input.nextInt();
				input.nextLine();
			}
			if (op == '/') {
				if (n2 == 0) {
					System.out.println("Error: division by 0");
				} else {
					System.out.println(n1 / n2);
				}
			} else if (op == '*') {
				System.out.println(n1 * n2);
			} else if (op == '-') {
				System.out.println(n1 - n2);
			} else {
				System.out.println(n1 + n2);
			}
		} while (!end);

		input.close();
	}
}
