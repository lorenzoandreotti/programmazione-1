public class Programma {
	public static void main(String[] args) {
		String espressione = args[0], valori = args[1];

		if (Metodi.checkEspr(espressione) && Metodi.checkValori(valori)) {
			int[] tabella = { 0, 0, 0, 0, 0 };

			Metodi.estraiValori(valori, tabella);

			String daCalc = Metodi.sostituisci(espressione, tabella);

			System.out.println(Metodi.calcola(daCalc));
		}

	}
}
