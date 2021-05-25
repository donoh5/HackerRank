package easy;

import java.util.Scanner;

public class JavaSubstringComparisons {
	public static void main (String[] agrs) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.nextLine();
	    int k = inp.nextInt();
	    inp.close();
	    String max = s.substring(0, k);
	    String min = s.substring(0, k);
	    int len = s.length() - k;
	    for(int i=0; i <= len; i++) {
	    	if(s.substring(i, i+k).compareTo(min) <= 0)
	    		min = s.substring(i, i+k);
	    	if(s.substring(i, i+k).compareTo(max) > 0)
	    		max = s.substring(i, i+k);
	    }
	    System.out.println(min);
	    System.out.println(max);
	}
}