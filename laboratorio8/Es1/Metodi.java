package laboratorio8.Es1;

public class Metodi {
	public static int[] creaArray() {
		return new int[100];
	}

	public static boolean aggiungiElemento(int[] array, int numeroElementi, int elemento) {
		if (numeroElementi == 100) {
			return false;
		}
		for (int i = 0; i < numeroElementi; i++) {
			if (array[i] == elemento) {
				return false;
			}
		}
		array[numeroElementi] = elemento;
		return true;
	}

	public static boolean rimuoviElemento(int[] array, int numeroElementi, int elemento) {
		for (int i = 0; i < numeroElementi; i++) {
			if (array[i] == elemento) {
				for (int j = i; j < numeroElementi - 2; j++) {
					array[j] = array[j + 1];
				}
				return true;
			}
		}
		return false;
	}
}
