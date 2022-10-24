package laboratorio2;

import java.util.Scanner;

public class Es1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		System.out.println(n >= 0 ? n : -n);
	}
}
