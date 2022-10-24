package laboratorio2;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		if (n2 == 0) {
			System.exit(1);
		}
		System.out.println(n1 / n2);
	}
}
