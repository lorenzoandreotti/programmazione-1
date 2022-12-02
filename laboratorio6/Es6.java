package laboratorio6;

import java.util.Scanner;

public class Es6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String genoma = input.nextLine();
		String proteina = input.nextLine();
		input.close();
		for (int i = 0; i < genoma.length() - proteina.length() + 1; i++) {
			if (substring(genoma, i, i + proteina.length() - 1).equals(proteina)) {
				System.out.println(i + 1);
			}
		}
	}

	private static String substring(String s, int beginIndex, int endIndex) {
		String result = "";
		for (int i = beginIndex; i < s.length() && i <= endIndex; i++) {
			result += s.charAt(i);
		}
		return result;
	}

	// private static int indexOf(String s, char c) {
	// 	int index = 0;
	// 	while (index < s.length() && s.charAt(index) != c) {
	// 		index++;
	// 	}
	// 	return index;
	// }
}
