package laboratorio3;

import java.util.Scanner;

public class Es1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mese = input.nextInt();
		if (mese < 1 || mese > 12) {
			System.exit(1);
		}
		int anno = input.nextInt();
		if (anno < 1900 || anno > 2099) {
			System.exit(1);
		}
		input.close();

		if (mese == 2 && isBisestile(anno)) {
			System.out.println(29);
		} else if (mese == 2 && !isBisestile(anno)) {
			System.out.println(28);
		} else if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
			System.out.println(30);
		} else {
			System.out.println(31);
		}

	}

	private static boolean isBisestile(int anno) {
		if (anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0)) {
			return true;
		}
		return false;
	}
}
