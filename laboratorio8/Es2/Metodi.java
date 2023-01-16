package laboratorio8.Es2;

public class Metodi {
	public static int[][] creaMondo() {
		int[][] mondo = new int[20][20];
		for (int i = 0; i < mondo.length; i++) {
			for (int j = 0; j < mondo[i].length; j++) {
				mondo[i][j] = 0;
			}
		}
		return mondo;
	}

	public static boolean aggiungiObiettivo(int[][] mondo, int riga, int colonna) {
		if (riga >= mondo.length || colonna >= mondo[0].length) {
			return false;
		}
		if (mondo[riga][colonna] == 0) {
			mondo[riga][colonna] = 1;
			return true;
		}
		return false;
	}

	public static void aggiungiOstacolo(int[][] mondo) {
		boolean ostacoloAggiunto = false;
		do {
			int i = (int) (Math.random() * mondo.length);
			int j = (int) (Math.random() * mondo[0].length);
			if (mondo[i][j] == 0) {
				mondo[i][j] = 2;
				ostacoloAggiunto = true;
			}
		} while (!ostacoloAggiunto);
	}

	public static int aggiungiPosizioniRobot(int[][] mondo, String percorso) {
		int x = 0, y = 0;
		mondo[x][y] = 3;
		for (int i = 0; i < percorso.length(); i++) {
			switch (percorso.charAt(i)) {
				case 'n':
					x--;
					break;
				case 's':
					x++;
					break;
				case 'o':
					y--;
					break;
				case 'e':
					y++;
					break;
			}

			if (x < 0 || x >= mondo.length || y < 0 || y >= mondo[0].length) {
				return 3;
			} else if (mondo[x][y] == 2) {
				return 2;
			} else if (mondo[x][y] == 1) {
				return 1;
			} else {
				mondo[x][y] = 3;
			}
		}
		return 0;
	}

	public static void stampaMondo(int[][] mondo) {
		for (int i = 0; i < mondo.length + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < mondo.length; i++) {
			System.out.print("*");
			for (int j = 0; j < mondo[i].length; j++) {
				if (mondo[i][j] == 0) {
					System.out.print(" ");
				}
				if (mondo[i][j] == 1) {
					System.out.print("X");
				}
				if (mondo[i][j] == 2) {
					System.out.print("#");
				}
				if (mondo[i][j] == 3) {
					System.out.print("O");
				}
			}
			System.out.println("*");
		}
		for (int i = 0; i < mondo.length + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
