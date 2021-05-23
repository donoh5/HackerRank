package easy;

import java.util.Scanner;

public class JavaLoops1 {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		int num = my_inp.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	
		my_inp.close();
	}

}