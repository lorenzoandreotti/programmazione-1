package laboratorio10;

class Test {
	public static void main(String[] args) {
		int[] x = new int[4];
		int[] y = new int[4];
		x[0] = 3;
		y = x;
		y[2] = 0;
		System.out.println(x[y[2]]);
	}
}