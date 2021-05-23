package easy;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		int loop = my_inp.nextInt();
		
		for(int i=1; i <= loop; i++) {
			
			String strNum = my_inp.next();
			
			try {
				Long.parseLong(strNum);
			} catch(NumberFormatException e) {
				System.out.println(strNum + " can't be fitted anywhere.");
				continue;
			}
			
			long num = Long.parseLong(strNum);
			
			if (num >= Math.pow(2, 64) && num <= -Math.pow(2, 64))
				System.out.println(strNum + " can't be fitted anywhere.");
			else
				System.out.println(strNum + " can be fitted in:");
				if (num <= Math.pow(2, 7)-1 && num >= -Math.pow(2, 7))
					System.out.println("* byte");
				if (num <= Math.pow(2, 15)-1 && num >= -Math.pow(2, 15))
					System.out.println("* short");
				if (num <= Math.pow(2, 31)-1 && num >= -Math.pow(2, 31))
					System.out.println("* int");
				if (num <= Math.pow(2, 63)-1 && num >= -Math.pow(2, 63))
					System.out.println("* long");
		}
		my_inp.close();
	}
}