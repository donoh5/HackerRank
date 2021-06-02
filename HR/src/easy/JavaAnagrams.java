package easy;

import java.util.Scanner;
import java.util.Arrays;
public class JavaAnagrams {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		String a = inp.next();
		String b = inp.next();
		a = a.toUpperCase();
		b = b.toUpperCase();
		inp.close();
		char[] a2 = a.toCharArray();
		char[] b2 = b.toCharArray();
		Arrays.sort(a2);
		Arrays.sort(b2);
		String newA = new String(a2);
		String newB = new String(b2);
		if (newA.equals(newB))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
}