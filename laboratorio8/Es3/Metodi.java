package laboratorio8.Es3;

public class Metodi {
	public static int[] creaMatrice(int n, int m) {
		return new int[n * m];
	}

	public static void scriviElemento(int[] array, int n, int m, int i, int j, int elemento) {
		if (n * m > array.length || i >= n || j >= m) {
			System.out.println("Index out of bounds");
			System.exit(0);
		}
		array[(n * i) + (j)] = elemento;
	}

	public static int leggiElemento(int[] array, int n, int m, int i, int j) {
		if (n * m > array.length || i >= n || j >= m) {
			System.out.println("Index out of bounds");
			System.exit(0);
		}
		return array[(n * i) + (j)];
	}

	public static void stampaMatrice(int[] array, int n, int m) {
		for (int i = 0; i < array.length / m; i++) {
			for (int j = 0; j < array.length / n; j++) {
				System.out.print(leggiElemento(array, n, m, i, j));
			}
			System.out.println();
		}
	}
}
