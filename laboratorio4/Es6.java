package laboratorio4;

import java.util.Scanner;

public class Es6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1, s2, intersection = "", union = "";

		do {
			s1 = input.nextLine();
			s2 = input.nextLine();
		} while (s1.length() != s2.length() && !s1.matches("[0-1]+") && !s2.matches("[0-1]*"));
		input.close();

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				union = union.concat("1");
				intersection = intersection.concat("0");
			} else if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == 0) {
				union = union.concat("0");
				intersection = intersection.concat("0");
			} else {
				union = union.concat("1");
				intersection = intersection.concat("1");
			}
		}
		System.out.println("union " + union);
		System.out.println("intersection " + intersection);

	}
}
