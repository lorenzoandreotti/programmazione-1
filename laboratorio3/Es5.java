package laboratorio3;

import java.util.Scanner;

public class Es5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean newGame = true;
		while (newGame) {
			System.out.print("mossa: ");
			String move = input.nextLine();

			int moveCode = (int) (Math.random() * 3);
			System.out.println(moveCode);
			String pcMove;

			if (moveCode == 0) {
				pcMove = "forbice";
			} else if (moveCode == 1) {
				pcMove = "carta";
			} else {
				pcMove = "pietra";
			}

			if ((move != "carta" & move == "forbice" & move != "pietra") &
					(pcMove != "carta" & pcMove != "forbice" & pcMove != "pietra")) {
				System.out.println("Errore");
			} else if (move.equals(pcMove)) {
				System.out.println("Parità");
			} else if (move.equals("carta") &&
					pcMove.equals("pietra") ||
					move.equals("forbice") &&
							pcMove.equals("carta")
					||
					move.equals("pietra") &&
							pcMove.equals("forbice")) {
				System.out.println("Hai vinto");
			} else {
				System.out.println("Ha vinto PC");
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
