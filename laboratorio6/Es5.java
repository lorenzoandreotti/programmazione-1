package laboratorio6;

import java.util.Scanner;

public class Es5 {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		String s;
		while (true) {
			int scelta = menu();
			switch (scelta) {
				case 1:
					n = input.nextInt();
					input.nextLine();
					System.out.println(convertiDecInBin(n));
					break;
				case 2:
					s = input.nextLine();
					System.out.println(convertiBinInDec(s));
					break;
				case 3:
					input.close();
					return;
				default:
					break;
			}
		}

	}

	private static int menu() {
		System.out.println("1) Decimale -> Binario\n2) Binario -> Decimale\n3) Uscita");
		int scelta = input.nextInt();
		input.nextLine();
		return scelta;
	}

	private static String convertiDecInBin(int n) {
		String s = "";
		while ((n / 2) != 0) {
			s = (n % 2) + s;
			n = n / 2;
		}
		s = "1" + s;
		return s;
	}

	private static int convertiBinInDec(String s) {
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				n += Math.pow(2, s.length() - 1 - i);
			}
		}
		return n;
	}
}
