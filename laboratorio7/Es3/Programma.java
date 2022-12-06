package laboratorio7.Es3;

public class Programma {
	public static void main(String[] args) {
		if (Metodi.controllaValiditaEspressione(args)) {
			System.out.println(Metodi.valutaEspression(args));
		} else {
			System.out.println("errore");
		}
	}
}
