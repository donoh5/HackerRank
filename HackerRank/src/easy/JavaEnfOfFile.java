package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaEnfOfFile {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		ArrayList<String> total = new ArrayList<String>();
		
		while(my_inp.hasNextLine()) {
			String str = my_inp.nextLine();
			total.add(str);
		}
		for (int z = 0; z<total.size(); z++) {
			System.out.println((z + 1) + " " + total.get(z));
		}
		my_inp.close();	
	}
}