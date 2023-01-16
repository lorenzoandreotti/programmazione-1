package laboratorio8.Es1;

// import java.util.Scanner;

public class Programma {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// int action;
		// do {
		// System.out.println("Scegli cosa fare");
		// System.out.println("1) Crea array");
		// System.out.println("2) Aggiungi elemento");
		// System.out.println("3) Rimuovi elemento");
		// System.out.println("4) Esci");
		// action = input.nextInt();
		// } while (action != 4);

		System.out.println("Creo array");

		int[] array = Metodi.creaArray();

		System.out.println("Aggiungo elementi");

		System.out.println(Metodi.aggiungiElemento(array, 0, 3));
		System.out.println(Metodi.aggiungiElemento(array, 1, 2));
		System.out.println(Metodi.aggiungiElemento(array, 2, 4));
		System.out.println(Metodi.aggiungiElemento(array, 3, 3));
		System.out.println(Metodi.aggiungiElemento(array, 4, 2));
		System.out.println(Metodi.aggiungiElemento(array, 5, 4));

		System.out.println("Rimuovo elemento");

		System.out.println(Metodi.rimuoviElemento(array, 5, 3));

	}
}