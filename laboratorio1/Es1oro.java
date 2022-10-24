import java.util.Scanner;

class Es1Oro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		do {
			n = scanner.nextInt();
		} while (!(n > 0));
		scanner.close();

		System.out.println(calcolaNConA(n));

	}

	static int calcolaNConA(int n) {
		if (n == 0) {
			return 2;
		}

		return (3 * calcolaNConA(n - 1) - 2);
	}
}
