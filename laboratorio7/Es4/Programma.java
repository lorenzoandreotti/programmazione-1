package laboratorio7.Es4;

import java.util.Scanner;

public class Programma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int w, h;

		do {
			System.out.print("righe: ");
			h = input.nextInt();
		} while (h <= 0 || h > 10);

		do {
			System.out.print("colonne: ");
			w = input.nextInt();
		} while (w <= 0 || w > 10);

		input.close();

		int[][] mat = Metodi.generaMatriceCasuale(h, w);

		Metodi.stampaMatrice(mat);

		int[][] trasposta = Metodi.trasponiMatrice(mat);

		Metodi.stampaMatrice(trasposta);
	}
}
