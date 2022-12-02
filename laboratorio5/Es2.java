package laboratorio5;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine(), s2 = input.nextLine(), s3 = "";
		input.close();
		for (int i = 0; i < s1.length() && i < s2.length()
				&& s1.charAt(i) == s2.charAt(i); s3 = s3.concat(s1.charAt(i) + ""), i++) {
		}
		System.out.println(s3);
	}
}
