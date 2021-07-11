package easy;

import java.util.Scanner;

public class Java_2D_array {
	public static void main (String[] agrs) {
		Scanner inp = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				arr[i][j] = inp.nextInt();
			}
		}
		int sum = 0;
		int max = -66666;
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				sum += arr[i][j];
				sum += arr[i][j+1];
				sum += arr[i][j+2];
				sum += arr[i+1][j+1];
				sum += arr[i+2][j];
				sum += arr[i+2][j+1];
				sum += arr[i+2][j+2];
				if (sum>max)
					max = sum;
				sum = 0;
			}
		}
		System.out.println(max);
		inp.close();
    }
}
