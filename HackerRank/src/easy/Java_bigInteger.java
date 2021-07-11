package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_bigInteger {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		String temp_a = inp.next();
		String temp_b = inp.next();
		
		BigInteger a = new BigInteger(temp_a);
		BigInteger b = new BigInteger(temp_b);
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		inp.close();
    }
}
