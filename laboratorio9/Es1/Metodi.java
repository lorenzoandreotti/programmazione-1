public class Metodi {
	public static boolean checkEspr(String espressione) {
		for (int i = 0; i < espressione.length(); i++) {
			if (i % 2 == 0 &&
					(!(espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'E') &&
							!((espressione.charAt(i) >= '0' && espressione.charAt(i) <= '9')))) {
				return false;
			}
			if (i % 2 == 1 && (espressione.charAt(i) != '-' && espressione.charAt(i) != '+')) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkValori(String valori) {
		for (int i = 0; i < valori.length(); i++) {
			if (i % 3 == 0 &&
					!(valori.charAt(i) >= 'A' && valori.charAt(i) <= 'E')) {
				return false;
			}
			if (i % 3 == 1 && !(valori.charAt(i) == ':')) {
				return false;
			}
			if (i % 3 == 2 &&
					!((valori.charAt(i) >= '0' && valori.charAt(i) <= '9'))) {
				return false;
			}
		}
		return true;
	}

	public static void estraiValori(String valori, int[] tabella) {
		for (int i = 0; i < valori.length(); i += 3) {
			if (i % 3 == 0) {
				tabella[valori.charAt(i) - 'A'] = valori.charAt(i + 2) - '0';
			}
		}
	}

	public static String sostituisci(String espressione, int[] tabella) {
		String daCalc = "";
		for (int i = 0; i < espressione.length(); i++) {
			if (espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'E') {
				daCalc += tabella[espressione.charAt(i) - 'A'] + "";
			} else {
				daCalc += espressione.charAt(i) + "";
			}
		}
		return daCalc;
	}

	public static int calcola(String daCalc) {
		System.out.println(daCalc);
		int result = daCalc.charAt(0) - '0';
		for (int i = 1; i < daCalc.length(); i += 2) {
			if (daCalc.charAt(i) == '+') {
				result += (daCalc.charAt(i + 1) - '0');
			}
			if (daCalc.charAt(i) == '-') {
				result -= (daCalc.charAt(i + 1) - '0');
			}
		}
		return result;
	}

}
