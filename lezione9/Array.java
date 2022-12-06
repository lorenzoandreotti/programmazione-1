package lezione9;

class Array {
	public static void main(String[] args) {
		double[] temps = new double[30];
		int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] clone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int[] part = new int[10];
		String[] partS = new String[10];

		for (int i = 0; i < temps.length; i++) {
			temps[i] = Math.random() * 20;
		}

		for (int i = 0; i < temps.length; i++) {
			System.out.println("temp " + i + ": " + temps[i]);
		}

		for (int i : numeri) {
			System.out.print(i + " ");
		}
		System.out.println();

		if (numeri == clone) {
			System.out.println("uguali");
		}

		if (args.length != 0) {
			System.out.println(args[0]);
		}

		part[0] = 2;
		part[1] = 5;
		part[2] = 3;
		part[3] = 8;
		part[4] = 4;
		part[5] = 1;

		for (int i : part) {
			System.out.println(i);
		}

		partS[0] = "Ciapo";
		partS[1] = "Ciao";
		partS[2] = "Cipo";
		partS[3] = "Capo";
		partS[4] = "iapo";
		partS[5] = "poi";

		for (String i : partS) {
			System.out.println(i);
		}
	}
}