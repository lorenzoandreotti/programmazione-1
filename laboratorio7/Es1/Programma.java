package laboratorio7.Es1;

import java.util.Scanner;

public class Programma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeriDaIndovinare = new int[5], numeroTentativi = new int[5];
		boolean[] indovinato = new boolean[5];
		boolean newgame = true;

		do {
			int n = Metodi.estraiNumeroCasuale(), min = 0, max = 100;
			boolean nIndovinato = false;
			System.out.println("indovinare il numero estratto a caso");
			System.out.println("inserire da tastiera un numero intero compreso tra 1 e 100");
			int j = 1;
			for (; j <= 10 && !nIndovinato; j++) {
				int x = input.nextInt();
				switch (Metodi.confrontaNumeri(x, n)) {
					case 0:
						nIndovinato = true;
						System.out.println("Hai indovinato");
						break;
					case -1:
						if (min < x) {
							min = x;
							System.out.println(x + " è più piccolo");
						} else {
							System.out.println("il numero è maggiore di " + min);
						}
						break;
					default:
						if (max > x) {
							max = x;
							System.out.println(x + " è più grande");
						} else {
							System.out.println("il numero è minore di " + max);
						}
						break;
				}
			}
			Metodi.aggiornaInformazioniPartite(numeriDaIndovinare, indovinato, numeroTentativi, n, nIndovinato,
					j);
			System.out.println("le tue statistiche");
			System.out.print("indovinato?\t");
			for (boolean b : indovinato) {
				System.out.print(b + "\t");
			}
			System.out.print("\nnumero\t\t");
			for (int numero : numeriDaIndovinare) {
				System.out.print(numero + "\t");
			}
			System.out.print("\nmosse\t\t");
			for (int mosse : numeroTentativi) {
				System.out.print(mosse + "\t");
			}
			System.out.println("\ngiocare ancora?\n1)sì\n2)no");
			int answer = input.nextInt();
			if (answer == 2) {
				newgame = false;
			}
		} while (newgame);
		input.close();
	}
}
