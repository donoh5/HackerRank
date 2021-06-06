package easy;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		int b, h;
		b = my_inp.nextInt();
		h = my_inp.nextInt();
		
		if (b <= 0 || h <= 0)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		else
			System.out.println(b * h);
		
		my_inp.close();	
	}
}