package laboratorio4;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), fatt = 1;
		input.close();
		if (n > 0) {
			while (n > 1) {
				fatt *= n--;
			}
		}
		System.out.println(fatt);
	}
}
