package Esercitazione1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// calcolare area di un rettanagolo base 3 altezza 8
		int base = 3;
		int altezza = 8;
		int area = base * altezza;

		// restituire l'area del rettangolo
		System.out.println("L'area del rettangolo è: " + area);

		// calcolare l'area del trapezio data base1, base2, altezza
		int base1 = 3;
		int base2 = 8;
		int altezzaTrapezio = 5;
		double areaTrapezio = (base1 + base2) * (double) altezzaTrapezio / 2;

		// restituire l'area del trapezio
		System.out.println("L'area del trapezio con baase: " + base1 + base2 + " ealtezza:  " + altezzaTrapezio + " è: "
				+ areaTrapezio);

		// richiedi base1, base2, altezza all'utente
		Scanner in = new Scanner(System.in);
		System.out.print("Immetere la base1: ");
		base1 = in.nextInt();
		System.out.print("Immettere la base2: ");
		base2 = in.nextInt();
		System.out.print("Immettere l' aletezza: ");
		altezzaTrapezio = in.nextInt();
		in.close();
		areaTrapezio = (base1 + base2) * altezzaTrapezio / 2;
		System.out.println("L'area del trapezio con baase: " + base1 + base2 + " ealtezza:  " + altezzaTrapezio + " è: "
				+ areaTrapezio);

		// leggere 3 interi e calcolare la media
		System.out.print("Immetere il primo intero:");
		int numeroUno = in.nextInt();
		System.out.print("Immetere il secondo intero:");
		int numeroDue = in.nextInt();
		System.out.print("Immetere il terzo intero:");
		int numeroTre = in.nextInt();
		float media = (numeroUno + numeroDue + numeroTre) / 3f;
		System.out.println("La media aritmetica dei numeri interi è: " + media);

		// chiedi all'utente tempo in ore, minuti, secondi e trasformalo in minuti
		System.out.print("Immetere le ore: ");
		int ore = in.nextInt();
		System.out.print("Immetere i minuti: ");
		int minuti = in.nextInt();
		System.out.print("Immetere i secondi: ");
		int secondi = in.nextInt();
		int tempoTrasformatoInMinuti = (ore * 60) + minuti + (secondi / 60);

		// calcola il ritmo per percorrere una maratona usando tempotrasformatoInMinuti
		float ritmoMinutiPerKm = tempoTrasformatoInMinuti / 42f;

		// stampo l'ritmo usando % f
		System.out.printf("Il suo ritmo è %.2f minuti per KM%n", ritmoMinutiPerKm);

	}

}
