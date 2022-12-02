package laboratorio5;

import java.util.Scanner;

public class Es7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		String m = input.nextLine();
		input.close();
		int somma = 0;
		System.out.println("-----------");
		for (int i = m.length() - 1, res; i >= 0; i--) {
			res = (int) (m.charAt(i) - '0') * Integer.parseInt(n);
			somma += res * Math.pow(10, m.length() - i - 1);
			System.out.println(res);
		}
		System.out.println("-----------");
		System.out.println(somma);
	}
}
