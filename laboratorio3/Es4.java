package laboratorio3;

import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nome1: ");
		String p1 = input.nextLine();
		System.out.print("nome2: ");
		String p2 = input.nextLine();

		boolean newGame = true;
		while (newGame) {
			System.out.print("mossa1: ");
			String p1Choice = input.nextLine();
			System.out.print("mossa2: ");
			String p2Choice = input.nextLine();

			if ((p1Choice != "carta" & p1Choice == "forbice" & p1Choice != "pietra") &
					(p2Choice != "carta" & p2Choice != "forbice" & p2Choice != "pietra")) {
				System.out.println("Errore");
			} else if (p1Choice.equals(p2Choice)) {
				System.out.println("Parità");
			} else if (p1Choice.equals("carta") &&
					p2Choice.equals("pietra") ||
					p1Choice.equals("forbice") &&
							p2Choice.equals("carta")
					||
					p1Choice.equals("pietra") &&
							p2Choice.equals("forbice")) {
				System.out.println("Ha vinto " + p1);
			} else {
				System.out.println("Ha vinto " + p2);
			}

			System.out.println("Giocare ancora? y/n");
			String answer = input.nextLine();
			if (answer.equals("n")) {
				newGame = false;
			}
		}
		input.close();
	}
}
