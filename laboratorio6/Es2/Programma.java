package laboratorio6.Es2;

import java.util.Scanner;

public class Programma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c;
		int a, b;
		double x, y;
		while (true) {
			System.out.println(
					"a) somma di due numeri interi\nb) divisione intera e resto tra due numeri interi\nc) media tra due numeri double\nd) valore assoluto di un numero intero\ne) lunghezza della stringa che rappresenta un numero intero\nt) termina il programma");
			c = input.nextLine().toLowerCase().charAt(0);
			switch (c) {
				case 't':
					input.close();
					return;
				case 'a':
					a = input.nextInt();
					b = input.nextInt();
					System.out.println(Metodi.sommaDueInteri(a, b));
					break;
				case 'b':
					a = input.nextInt();
					b = input.nextInt();
					if (b != 0) {
						System.out.println(Metodi.divisioneIntera(a, b));
						System.out.println(Metodi.restoDivisioneIntera(a, b));
					}
					break;
				case 'c':
					x = input.nextDouble();
					y = input.nextDouble();
					System.out.println(Metodi.mediaTraDueDouble(x, y));
					break;
				case 'd':
					a = input.nextInt();
					System.out.println(Metodi.valoreAssolutoIntero(a));
					break;
				case 'e':
					a = input.nextInt();
					System.out.println(Metodi.lunghezzaStringaIntero(a));
					break;
				default:
					System.out.println("Errore");
					break;
			}
			input.nextLine();
		}
	}
}
