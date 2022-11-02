package laboratorio3;

import java.util.Scanner;

public class Es3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int teoria = input.nextInt();
		int pratica = input.nextInt();
		input.close();

		if (teoria <= 0 && teoria + pratica >= 18) {
			System.out.println("Bocciato, devi studiare di più la teoria");
		} else if (teoria <= 0 && pratica < 18) {
			System.out.println("Bocciato, devi studiare ed esercitarti di più");
		} else if (teoria > 0 && teoria + pratica < 18) {
			System.out.println("Bocciato: devi esercitarti di più");
		} else if (teoria + pratica == 31 || teoria + pratica == 32) {
			System.out.println("Congratulazioni: 30 e lode!");
		} else {
			System.out.println("Il tuo voto è " + (teoria + pratica));
		}

	}
}
