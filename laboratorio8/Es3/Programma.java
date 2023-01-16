package laboratorio8.Es3;

public class Programma {
	public static void main(String[] args) {
		int n = 4, m = 5;

		int[] matrice = Metodi.creaMatrice(n, m);

		for (int i = 0; i < matrice.length / m; i++) {
			for (int j = 0; j < matrice.length / n; j++) {
				Metodi.scriviElemento(matrice, n, m, i, j, (int) (Math.random() * 9));
			}
		}

		Metodi.stampaMatrice(matrice, n, m);
	}
}
