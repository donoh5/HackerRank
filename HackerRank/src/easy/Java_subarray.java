package easy;

import java.util.Scanner;

public class Java_subarray {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i=0; i<size; i++)
			arr[i] = inp.nextInt();
		int sum = 0;
		int count = 0;
		for (int i=0; i<size; i++) {
			for (int j=i; j<size; j++) {
				sum += arr[j];
				if (sum<0) {
					count++;
				}
			}
			sum = 0;
		}
		System.out.println(count);
		inp.close();
    }
}
