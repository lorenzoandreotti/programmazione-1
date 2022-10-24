package laboratorio2;

import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		input.close();
		if (!(n >= 0 && n <= 127)) {
			System.out.println("Errore: il numero inserito deve essere compreso tra 0 e 127!");
			System.exit(1);
		}
		int[] arr = new int[7];
		for (int i = arr.length - 1, j = n; i >= 0; i--, j /= 2) {
			arr[i] = j % 2;
		}
		System.out.print("La rappresentazione binaria di " + n + " è: ");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
}
