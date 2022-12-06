package laboratorio7.Es2;

import java.util.Scanner;

public class Programma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] parola = Metodi.estraiStringaCasuale().toCharArray();
		char[] lettere = new char[parola.length];
		for (int i = 0; i < lettere.length; i++) {
			lettere[i] = '-';
		}
		boolean indovinato = false;

		for (int i = 0; i < 20 && !indovinato; i++) {
			Metodi.stampaLettereIndovinate(parola, lettere);
			Metodi.scopriLettera(input.nextLine().toLowerCase().charAt(0), parola, lettere);
			indovinato = true;
			for (int j = 0; j < lettere.length && indovinato; j++) {
				if (lettere[j] == '-') {
					indovinato = false;
				}
			}
		}

		input.close();

		System.out.println(parola);
	}
}
