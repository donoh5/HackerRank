package easy;

import java.util.Scanner;

public class JavaSubstring {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int start, end;
        start = inp.nextInt();
        end = inp.nextInt();
        System.out.println(s.substring(start, end));
        inp.close();
    }
}