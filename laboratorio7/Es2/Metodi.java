package laboratorio7.Es2;

public class Metodi {
	final private static String[] parole = { "automobile", "bicicletta", "cane", "dottore", "elefante", "foglia",
			"giocattolo" };

	public static String estraiStringaCasuale() {
		return parole[(int) (Math.random() * (parole.length - 1))];
	}

	public static void stampaLettereIndovinate(char[] parola, char[] lettere) {
		for (int i = 0; i < parola.length; i++) {
			boolean scoperta = false;
			for (int j = 0; j < lettere.length && !scoperta; j++) {
				if (parola[i] == lettere[j]) {
					scoperta = true;
				}
			}
			System.out.print(scoperta ? parola[i] : "-");
		}
		System.out.println();
	}

	public static void scopriLettera(char lettera, char[] parola, char[] lettere) {
		boolean scoperta = true;
		for (int i = 0; i < parola.length && scoperta; i++) {
			if (parola[i] == lettera) {
				lettere[i] = lettera;
			}
		}
	}
}
