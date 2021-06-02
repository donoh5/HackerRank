package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringTokens {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		String a = inp.nextLine();
		inp.close();
		ArrayList<String> ayo = new ArrayList<String>();
		String[] newA = a.split(",|'|\\?| |@|_|!|\\.");
		
		for(int i = 0; i < newA.length; i++) {
			String temp = newA[i];
			if (temp != "") {
				ayo.add(newA[i]);
			}
		}
		System.out.println(ayo.size());
		for(int z = 0; z < ayo.size(); z++) {
			System.out.println(ayo.get(z));
		}
	}
}