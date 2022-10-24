import java.util.Scanner;

class Es2Oro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double epsilon;
		int n;

		do {
			epsilon = scanner.nextDouble();
		} while (!(epsilon > 0.0));
		scanner.close();

		for (n = 0; (1 - epsilon) < ((double) n / (n + 1.0)) && (((double) n / (n + 1.0)) <= 1.0); n++) {
		}

		n--;

		System.out.println(n);
		System.out.println(n / (n + 1.0));
	}
}
