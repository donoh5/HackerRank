package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoops2 {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		int loop = my_inp.nextInt();
		String newStore = "";
		ArrayList<String> total = new ArrayList<String>();
		
		for(int i = 1; i <= loop; i++) {
			int a, b, n;
			a = my_inp.nextInt();
			b = my_inp.nextInt();
			n = my_inp.nextInt();
			int store = a;
			ArrayList<String> list = new ArrayList<String>();
			for(int x = 0; x < n; x++) {
				store = store + ((int)Math.pow(2, x) * b);
				newStore = Integer.toString(store);
				list.add(newStore);
			}
			StringBuilder str = new StringBuilder();
			for (String index : list) {
				str.append(index);
				str.append(" ");
			}
			String singleString = str.toString();
			total.add(singleString);
		}
		
		for (int z = 0; z<total.size(); z++) {
			System.out.println(total.get(z));
		}
		my_inp.close();
		
	}

}