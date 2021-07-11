package easy;

import java.util.Scanner;

public class Java_1D_array {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		int index = inp.nextInt();
		int[] arr = new int[index];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = inp.nextInt();
		}
		for (int j : arr) {
			System.out.println(j);
		}
		inp.close();
    }
}
