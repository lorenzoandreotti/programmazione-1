package laboratorio8.Es2;

public class Programma {
	public static void main(String[] args) {
		int[][] mondo = Metodi.creaMondo();

		System.out
				.println(Metodi.aggiungiObiettivo(mondo, (int) (args[0].charAt(0) - '0'), (int) (args[1].charAt(0) - '0')));

		for (int i = 0; i < 10; i++) {
			Metodi.aggiungiOstacolo(mondo);
		}

		System.out.println(Metodi.aggiungiPosizioniRobot(mondo, args[2]));

		Metodi.stampaMondo(mondo);

	}
}
