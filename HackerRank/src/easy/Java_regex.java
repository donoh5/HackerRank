package easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Java_regex {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		while (inp.hasNextLine()) {
			String st = inp.nextLine();
			String REGEX = "^(0|25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]).(0|25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]).(0|25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]).(0|25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])";
			Pattern pattern = Pattern.compile(REGEX);
			boolean matches = pattern.matcher(st).matches();
			System.out.println(matches);
		}
		inp.close();
	}
}