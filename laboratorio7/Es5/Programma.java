package laboratorio7.Es5;

public class Programma {
	public static void main(String[] args) {
		String chiave = "", messaggio = "", cifrato = "";
		int scelta;

		do {
			scelta = Metodi.sceltaMenu();

			if (scelta == 1) {
				chiave = Metodi.cambiaParolaChiave();
			}
			if (scelta == 2) {
				if (chiave == "") {
					System.out.println("scegli parola chiave");
				} else {
					messaggio = Metodi.input.nextLine();
					cifrato = Metodi.cifraMessaggio(messaggio, chiave);
					System.out.println(cifrato);
				}
			}
			if (scelta == 3) {
				System.out.println(Metodi.decifraMessaggio(cifrato, chiave));
			}
		} while (scelta != 0);
	}
}
