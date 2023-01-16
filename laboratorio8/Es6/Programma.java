package laboratorio8.Es6;

public class Programma {
	public static void main(String[] args) {
		boolean nuovaPartita;
		do {
			nuovaPartita = false;
			char[][] configurazione = Metodi.creaNuovaConfigurazione();
			do {
				Metodi.mossaUtente(configurazione);
				Metodi.mossaComputer(configurazione);
				Metodi.stampaConfigurazioneDiGioco(configurazione);
			} while (Metodi.verificaVittoria(configurazione) == 0);

		} while (nuovaPartita);
	}
}
