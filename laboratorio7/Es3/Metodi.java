package laboratorio7.Es3;

public class Metodi {
	public static boolean controllaValiditaEspressione(String[] args) {
		if (args.length < 1) {
			return false;
		}
		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0 && (args[i].charAt(0) < '0' || args[i].charAt(0) > '9')) {
				return false;
			}
			if (i % 2 != 0 && (args[i].charAt(0) != '+' && args[i].charAt(0) != '-')) {
				return false;
			}
		}
		return true;
	}

	public static int valutaOperando(String op) {
		return (int) (op.charAt(0) - '0');
	}

	public static int valutaEspression(String[] args) {
		int result = valutaOperando(args[0]);

		for (int i = 1; i < args.length; i += 2) {
			int n = valutaOperando(args[i + 1]);
			if (args[i].charAt(0) == '+') {
				result += n;
			} else {
				result -= n;
			}
		}

		return result;
	}
}
