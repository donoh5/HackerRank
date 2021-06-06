package easy;

import java.util.Scanner;

public class JavaOutputFormatting {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		String line1_1, line2_1, line3_1;
		int line1_2, line2_2, line3_2;
		
		line1_1 = my_inp.next();
		line1_2 = my_inp.nextInt();
		
		line2_1 = my_inp.next();
		line2_2 = my_inp.nextInt();
		
		line3_1 = my_inp.next();
		line3_2 = my_inp.nextInt();
		
		String newline1_2;
		if (line1_2 == 0)
			newline1_2 = "000";
		else if (line1_2 < 100)
			newline1_2 = "0" + Integer.toString(line1_2);
		else
			newline1_2 = Integer.toString(line1_2);
		
		String newline2_2;
		if (line2_2 == 0)
			newline2_2 = "000";
		else if (line2_2 < 100)
			newline2_2 = "0" + Integer.toString(line2_2);
		else
			newline2_2 = Integer.toString(line2_2);
		
		String newline3_2;
		if (line3_2 == 0)
			newline3_2 = "000";
		else if (line3_2 < 100)
			newline3_2 = "0" + Integer.toString(line3_2);
		else
			newline3_2 = Integer.toString(line3_2);
		
		int empty_1 = 15 - line1_1.length();
		int empty_2 = 15 - line2_1.length();
		int empty_3 = 15 - line3_1.length();
				
		System.out.println("================================");
		
		System.out.println(line1_1 + (String.format("%" + empty_1 + "s"," ").replace(' ', ' ')) + newline1_2);
		System.out.println(line2_1 + (String.format("%" + empty_2 + "s"," ").replace(' ', ' ')) + newline2_2);
		System.out.println(line3_1 + (String.format("%" + empty_3 + "s"," ").replace(' ', ' ')) + newline3_2);
		
		System.out.println("================================");
		
		my_inp.close();
	}

}