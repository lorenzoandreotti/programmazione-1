package laboratorio5;

import java.util.Scanner;

/**
 * Es1
 */
public class Es1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), pow = 1;
		input.close();
		while (pow <= n) {
			pow *= 2;
		}
		System.out.println(pow);
	}
}