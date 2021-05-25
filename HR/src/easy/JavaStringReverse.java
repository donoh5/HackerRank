package easy;

import java.util.Scanner;

public class JavaStringReverse {
	public static void main (String[] agrs) {
	    Scanner inp = new Scanner(System.in);
	    String A = inp.nextLine();
	    inp.close();
	    int len = A.length();
	    if (A.length()%2 != 0) {
	    	for (int i = 0; i<len/2; i++) {
	    		if (A.charAt(i) == A.charAt(len -1 - i))
	    			continue;
	    		else {
	    			System.out.println("No");
	    			System.exit(0);
	    		}
	    	}
	    }
	    else {
	    	for (int i = 0; i<len/2; i++) {
	    		if (A.charAt(i) == A.charAt(len -1 - i))
	    			continue;
	    		else {
	    			System.out.println("No");
	    			System.exit(0);
	    		}
	    	}
	    }
	    	
	    System.out.println("Yes");
	}
}