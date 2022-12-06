package laboratorio7.Es4;

public class Metodi {
	public static int[][] generaMatriceCasuale(int h, int w) {
		int[][] mat = new int[h][w];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = (int) (Math.random() * 99);
			}
		}

		return mat;
	}

	public static int[][] trasponiMatrice(int[][] mat) {
		int[][] trasposta = new int[mat[0].length][mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				trasposta[j][i] = mat[i][j];
			}
		}

		return trasposta;
	}

	public static void stampaMatrice(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
