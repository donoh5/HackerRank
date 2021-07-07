package easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Java_valid_username {
	public static void main (String[] agrs) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		int loop = inp.nextInt();
		inp.nextLine();
		for (; loop > 0; loop--) {
			String st = inp.nextLine();
			String REGEX = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
			Pattern pattern = Pattern.compile(REGEX);
			boolean matches = pattern.matcher(st).matches();
			System.out.println(matches);
		}
		inp.close();
	}
}