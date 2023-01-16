package laboratorio8.Es6;

import java.util.Scanner;

public class Metodi {
	private static final Scanner input = new Scanner(System.in);

	public static char[][] creaNuovaConfigurazione() {
		char[][] tabella = new char[3][3];
		for (int i = 0; i < tabella.length; i++) {
			for (int j = 0; j < tabella[i].length; j++) {
				tabella[i][j] = ' ';
			}
		}
		return tabella;
	}

	public static void stampaConfigurazioneDiGioco(char[][] tabella) {
		System.out.print(tabella[0][0]);
		for (int j = 1; j < tabella[0].length; j++) {
			System.out.print("|" + tabella[0][j]);
		}
		System.out.println();
		for (int i = 1; i < tabella.length; i++) {
			System.out.print("-");
			for (int j = 1; j < tabella[i].length; j++) {
				System.out.print("+-");
			}
			System.out.println();
			System.out.print(tabella[i][0]);
			for (int j = 1; j < tabella[i].length; j++) {
				System.out.print("|" + tabella[i][j]);
			}
			System.out.println();
		}
	}

	public static void mossaUtente(char[][] tabella) {
		int casella = 0;
		do {
			casella = input.nextInt();
			if (casella < 1 || casella > 9) {
				System.out.println("Casella non valida");
			}
		} while (casella < 1 || casella > 9
				|| tabella[(casella - 1) / 3][(casella - 1) % 3] == 'X' || tabella[casella / 3][casella % 3] == 'O');

		tabella[(casella - 1) / 3][(casella - 1) % 3] = 'X';

	}

	public static void mossaComputer(char[][] tabella) {
		if (tabella[1][1] == ' ') {
			tabella[1][1] = 'O';
		} else if (tabella[0][0] == ' ') {
			tabella[0][0] = 'O';
		} else if (tabella[2][2] == ' ') {
			tabella[2][2] = 'O';
		} else if (tabella[0][2] == ' ') {
			tabella[0][2] = 'O';
		} else if (tabella[2][0] == ' ') {
			tabella[2][0] = 'O';
		}
	}

	public static int verificaVittoria(char[][] tabella) {
		return 0;
	}
}
