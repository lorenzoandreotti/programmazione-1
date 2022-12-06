package laboratorio7.Es5;

import java.util.Scanner;

public class Metodi {
	public static final Scanner input = new Scanner(System.in);

	public static int sceltaMenu() {
		System.out.println(
				"1) Inserisci/cambia la parola chiave\n2) Cifra un messaggio\n3) Decifra un messaggio\n0) Esci dal programma");
		int n = input.nextInt();
		input.nextLine();
		return n;
	}

	public static String cambiaParolaChiave() {
		System.out.print("nuova parola chiave: ");
		return input.nextLine();
	}

	public static char[][] creaMatrice() {
		char[][] mat = new char[26][26];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = (char) ((int) 'a' + (i + j) % 26);
			}
		}

		return mat;
	}

	public static char cifraLettera(char letteraParola, char letteraChiave, char[][] mat) {
		return mat[letteraParola - 'a'][letteraChiave - 'a'];
	}

	public static char decifraLettera(char letteraCifrata, char letteraChiave, char[][] mat) {
		int i;
		for (i = 0; i < mat.length && mat[letteraChiave - 'a'][i] != letteraCifrata; i++) {

		}

		return (char) ('a' + i);

	}

	public static String cifraMessaggio(String parola, String chiave) {
		String cifrato = "";

		char[][] mat = creaMatrice();

		for (int i = 0; i < parola.length(); i++) {
			cifrato += cifraLettera(parola.charAt(i), chiave.charAt(i % chiave.length()), mat);
		}

		return cifrato;
	}

	public static String decifraMessaggio(String cifrato, String chiave) {
		String parola = "";

		char[][] mat = creaMatrice();

		for (int i = 0; i < cifrato.length(); i++) {
			parola += decifraLettera(cifrato.charAt(i), chiave.charAt(i % chiave.length()), mat);
		}

		return parola;
	}

}
