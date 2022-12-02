package laboratorio6.Es2;

public class Metodi {
	public static int sommaDueInteri(int a, int b) {
		return a + b;
	}

	public static int divisioneIntera(int a, int b) {
		return a / b;
	}

	public static int restoDivisioneIntera(int a, int b) {
		return a % b;
	}

	public static double mediaTraDueDouble(double a, double b) {
		return (a + b) / 2;
	}

	public static int valoreAssolutoIntero(int n) {
		if (n < 0) {
			return -n;
		}
		return n;
	}

	public static int lunghezzaStringaIntero(int n) {
		return (n + "").length();
	}

}
