package laboratorio7.Es1;

public class Metodi {
	public static int estraiNumeroCasuale() {
		return (int) (Math.random() * 99 + 1);
	}

	public static int confrontaNumeri(int numeroInserito, int numeroDaIndovinare) {
		if (numeroInserito == numeroDaIndovinare) {
			return 0;
		} else if (numeroInserito < numeroDaIndovinare) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void aggiornaInformazioniPartite(int[] numeriDaIndovinare, boolean[] indovinato,
			int[] numeroTentativi, int n, boolean nIndovinato, int nTentativo) {
		for (int i = 4; i > 0; i--) {
			numeriDaIndovinare[i] = numeriDaIndovinare[i - 1];
			indovinato[i] = indovinato[i - 1];
			numeroTentativi[i] = numeroTentativi[i - 1];
		}
		numeriDaIndovinare[0] = n;
		indovinato[0] = nIndovinato;
		numeroTentativi[0] = nTentativo;
	}

}
