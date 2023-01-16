package laboratorio8.Es4;

public class Programma {
	public static void main(String[] args) {
		System.out.println(somma(5, 4));
	}

	public static int somma(int a, int b) {
		if (b == 0) {
			return a;
		}
		return somma(a + 1, b - 1);
	}
}
