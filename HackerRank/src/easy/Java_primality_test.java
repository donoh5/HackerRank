package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_primality_test {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		String in = inp.next();
		BigInteger num = new BigInteger(in);
        
        boolean asd = num.isProbablePrime(1);
        if (asd)
            System.out.println("prime");    
        else
            System.out.println("not prime");
		inp.close();
    }
}
