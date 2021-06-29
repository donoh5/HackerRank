package easy;

import java.util.Scanner;
import java.util.regex.*;

public class Pattern_syntax_checker {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		int loop = inp.nextInt();
		inp.nextLine();
		for (;loop>0;loop--) {
			try {
				String REGEX = inp.nextLine();
				Pattern pattern = Pattern.compile(REGEX);
				System.out.println("Valid");
			} catch (Exception ex) {
				System.out.println("Invalid");
			}
		}
		inp.close();
	}
}