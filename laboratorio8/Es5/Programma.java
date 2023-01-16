package laboratorio8.Es5;

public class Programma {
	public static void main(String[] args) {
		System.out.println(mcd(20, 15));
	}

	public static int mcd(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a < b) {
			return mcd(a, b - a);
		}
		return mcd(a - b, b);
	}
}
